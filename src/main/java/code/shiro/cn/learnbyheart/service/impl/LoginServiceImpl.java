package code.shiro.cn.learnbyheart.service.impl;

import code.shiro.cn.learnbyheart.pojo.Permission;
import code.shiro.cn.learnbyheart.pojo.Role;
import code.shiro.cn.learnbyheart.pojo.User;
import code.shiro.cn.learnbyheart.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService {
    @Override
    public User getUserByName(String username) {
        return getMapByName(username);
    }

    // 模拟数据库操作
    User getMapByName(String username){
        Permission permission1 = new Permission(1L, "query");
        Permission permission2 = new Permission(2L, "delete");
        Permission permission3 = new Permission(1L, "put");
        Permission permission4 = new Permission(1L, "alter");

        Set<Permission> adminPermits = new HashSet<Permission>();
        adminPermits.add(permission1);
        adminPermits.add(permission2);
        adminPermits.add(permission3);
        adminPermits.add(permission4);

        Set<Permission> otherPermits = new HashSet<Permission>();
        otherPermits.add(permission1);

        Role role1 = new Role(1L,"admin",adminPermits);
        Role role2 = new Role(2L,"other",otherPermits);

        Set<Role> adminRole = new HashSet<>();
        adminRole.add(role1);

        Set<Role> otherRole = new HashSet<>();
        otherRole.add(role2);

        Map<String,User> map = new HashMap<>();


        User user1 = new User(1L,"admin","123454",adminRole);
        User user2 = new User(2L,"lisi","6654677",otherRole);
        User user3 = new User(3L,"wangwu","3492734",otherRole);
        User user4 = new User(4L,"zhaoliu","3243121",otherRole);


        map.put(user1.getName(),user1);
        map.put(user2.getName(),user2);
        map.put(user3.getName(),user3);
        map.put(user4.getName(),user4);


        return map.get(username);
    }
}
