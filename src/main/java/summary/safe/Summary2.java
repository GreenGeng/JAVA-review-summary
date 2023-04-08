package summary.safe;

public class Summary2 {
    /**
     * 如果不是用户交互的话 审计的时候就可以过滤掉
     *
     * csrf: 假冒用户身份去做一些不合理操作 防护：token、再次验证密码、referer
     * xss：获取cookie 后台没有对用户输入进行过滤或者检查 直接把用户输入返回到前端 导致恶意代码在前端任意执行
     * sql注入
     * json注入
     *
     * ssrf: 服务器端访问另一个URL没有过滤
     * yml反序列化：防护：safeConstruct()->转tag标签 类似白名单过滤
     * shiro反序列化：
     * 目录遍历：禁止外界指定文件，文件名不能包含目录，限定文件名只有字母和数字
     * 文件上传：上传巨大文件会导致DOS（限制文件大小），上传可执行脚本文件（注意文件名后缀限制）
     * rce：代码执行 输入过滤 输出编码
     * xml注入：XXE 常见关键字： http、https file ftp mailto jar netdoc
     *
     *  反序列化漏洞
     *  Apache commons colletions 这个库利用在了很多组件上
     *  WebSphere、WebLogic、Jenkins
     *  涉及问题点的两个类：ObjectInputStream、InvokerTransformer
     *
     *  java命令执行：Runtime 和 ProcessBuilder
     *  Runtime的exec方法底层使用了ProcessBuilder类
     *  processBuilder.start();和runtime.exec()都是执行命令的操作
     *
     *
     * 泛微OA漏洞
     * sql注入
     *
     * 若依漏洞
     * shiro反序列化（使用了低版本的shiro组件）rememberme 绕过方式
     * yml反序列化（定时任务-添加任务那里 因为这里用到了yml解析）
     * sql注入
     * 任意文件读取：代码查看下载接口代码
     *
     *
     * 组件漏洞
     * redis
     *  指令安全、端口安全、Lua脚本安全、SSL代理
     *
     *
     * es
     *
     * tomcat
     *
     * nginx
     *
     * docker
     *  docker逃逸 Docker版本 < 18.09.2，runC版本< 1.0-rc6。
     *
     *
     *  邮件安全
     *  邮件病毒、邮件炸弹、密码问题、钓鱼邮件
     *
     * 其他：
     *  硬编码 弱密码
     *
     */
}
