package code.shiro.cn.learnbyheart.reaml;

import code.shiro.cn.learnbyheart.pojo.Permission;
import code.shiro.cn.learnbyheart.pojo.Role;
import code.shiro.cn.learnbyheart.pojo.User;
import code.shiro.cn.learnbyheart.service.LoginService;
import io.netty.util.internal.StringUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.util.StringUtils;

public class UserReaml extends AuthorizingRealm {

    @Autowired
    private LoginService loginService;
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String name = (String) principalCollection.getPrimaryPrincipal();
        User user = loginService.getUserByName(name);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        for(Role role:user.getRoles()){
            simpleAuthorizationInfo.addRole(role.getName());
            for(Permission permission:role.getPermissions()){
                simpleAuthorizationInfo.addStringPermission(permission.getName());
            }
        }
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        if(StringUtils.isEmpty(authenticationToken.getPrincipal().toString())){
            return null;
        }
        String name = authenticationToken.getPrincipal().toString();
        User usr = loginService.getUserByName(name);
        if (usr == null){
            return null;
        }
        else{
            return  new SimpleAuthenticationInfo(name,usr.getPwd().toString(),getName());
        }
    }
}
