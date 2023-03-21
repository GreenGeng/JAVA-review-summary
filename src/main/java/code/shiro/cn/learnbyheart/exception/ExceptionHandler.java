package code.shiro.cn.learnbyheart.exception;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
@Slf4j
public class ExceptionHandler {
    public String ErrorHandler(AuthorizationException e){
        log.error(String.valueOf(e));
        return "没有通过权限验证";
    }
}
