package code.shiro.cn.learnbyheart.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String pwd;

    private Set<Role> roles;


}
