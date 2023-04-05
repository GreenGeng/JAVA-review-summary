package summary.safe.ssrf;

public class Summary1 {
    /**
     * ssrf伪协议
     * file ftp mailto http https jar netdoc
     *
     * URLConnection 可以走邮件文件传输等
     * HttpURLConnection 只能走HTTP协议
     * 如果强制转成下面的连接就不能读到文件等资源
     * 如果是上面的连接就可以
     *
     *
     * java命令执行：Runtime ProcessBuilder
     * Runtime的exec方法底层使用了ProcessBuilder类
     * processBuilder.start();和runtime.exec()都是执行命令的操作
     *
     *
     * 反序列化漏洞
     * Apache commons colletions 这个库利用在了很多组建上
     * WebSphere、WebLogic、Jenkins
     * 涉及问题点的两个类：ObjectInputStream、InvokerTransformer
     *
     *
     *
     * xss
     * 后台没有对用户输入进行过滤或者检查 直接把用户输入返回到前端 导致恶意代码在前端任意执行
     *
     *
     * CRLF注入
     *
     * XXE
     * http、https file ftp mailto jar netdoc
     *
     *
     */
}
