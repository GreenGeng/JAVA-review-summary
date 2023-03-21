package code.shiro.cn.learnbyheart.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Role {
    private Long id;
    private String name;
    private Set<Permission> permissions;
}
