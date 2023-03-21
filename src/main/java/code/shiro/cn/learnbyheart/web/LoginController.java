package code.shiro.cn.learnbyheart.web;

import code.shiro.cn.learnbyheart.pojo.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(User user){
        if(StringUtils.isEmpty(user.getName()) || StringUtils.isEmpty(user.getPwd())){
            return "请输入正确的用户名密码";
        }

        //用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), user.getPwd());

        try {
            subject.login(token);
            //检查身份和权限
            subject.checkRole("admin");
            subject.checkPermissions("query", "delete");
        }catch (AuthorizationException e){
            return "没有权限";
        }
        catch (AuthenticationException e){
            return "账号密码错误";
        }
        catch (Exception e){
            return "其他错误";
        }

        return  "success";

    }


    @RequiresRoles("admin")
    @GetMapping("/admin")
    public String admin(){
        return "admin success";
    }

    @RequiresPermissions("query")
    @GetMapping("/index")
    public String index(){
        return "index success";
    }

    @RequiresPermissions("add")
    @GetMapping("/add")
    public String add(){
        return "add success";
    }
}
