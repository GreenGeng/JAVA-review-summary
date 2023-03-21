package code.shiro.cn.learnbyheart.service;

import code.shiro.cn.learnbyheart.pojo.User;
import org.springframework.stereotype.Service;


@Service
public interface LoginService {
    User getUserByName(String username);
}
