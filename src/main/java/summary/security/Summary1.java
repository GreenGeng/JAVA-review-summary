package summary.security;

public class Summary1 {
    /**
     * 如果不是用户交互的话 审计的时候就可以过滤掉
     *
     * csrf: 假冒用户身份去做一些不合理操作 防护：token、再次验证密码、referer
     *
     * xss：获取cookie 后台没有对用户输入进行过滤或者检查 直接把用户输入返回到前端 导致恶意代码在前端任意执行
     * 防护：设置HTTPOnly、对用户输入进行验证、对不可信数据进行恰当的输出编码
     * 关键字：getParamter、<%=、param.
     *
     * sql注入:PrepareStatement，$,禁止拼接 ,
     * json注入：用户自定义构造恶意代码的json 服务器端没有对输入做过滤处理 解决：使用安全的序列化函数代替
     * http响应截断：request的参数里没有限制 可能会传入\r\n截断响应 使用白名单验证请求参数（只能由字母和数字构成）
     * ssrf: 服务器端访问另一个URL没有过滤
     * rce（命令执行、代码执行）：代码执行 输入过滤 输出编码
     * 重定向：重定向的url没有验证  建议创建一份合理的URL列表
     * 命令注入：关键字Runtime.exec() 、proccessBuilder.start()
     * DDOS：发送大量请求，消耗服务器资源，导致服务器奔溃（例如 用户向服务器发送超大文件） 防护：严格校验输入
     * 动态代码执行（代码注入）：请求的参数是动态的没有进行过滤校验 可能存在代码注入的风险， 防护：服务器端绝对不能直接解析和执行未经验证的用户输入的数据
     * 反射文件下载：允许攻击者创建钓鱼URL或者页面的漏洞 访问该URL或者页面的时候 就会下载来自不可信任域任意内容的文件
     * 二次注入：
     * 日志敏感记录：关键字log.info logger.info
     *
     * 反序列化总结
     * 关键字：ObjectInputStream.readObject、ObjectInputStream.readUnshared、XMLDecoder.readObject、Yaml.load 、 XStream.fromXML 、 ObjectMapper.readValue 、
     * xml反序列化：xml文档被用户控制，攻击者就有机会在服务器上执行任意的恶意代码
     * yml反序列化：防护：safeConstruct()->转tag标签 类似白名单过滤
     * shiro反序列化：key硬编码 爆破key之后伪造cookie 服务器端获取cookie之后反序列化过程就执行了恶意代码
     * fastjson反序列化：@Type字段反序列化时没有做安全校验 关键字：JSON.parseObject，JSON.toJsonString
     * Apache commons colletions 这个库利用在了很多组件上 例如 WebSphere、WebLogic、Jenkins 涉及问题点的两个类：ObjectInputStream、InvokerTransformer
     *
     * xml注入(读取xml时候 出现类似代码：<!Doctype foo System "file:/x/x">)：SAX 或者 DOM解析的时候就会访问这些URI 就能读取到恶意代码
     * 解决方式：实现SAX的EntityResolve接口 类似白名单过滤
     * XXE 常见关键字： http、https file ftp mailto jar netdoc
     * xml注入关键字：SAXBuilder、SAXParser、XMLReader、DocumentBuilder
     *
     *
     * 文件操作
     * 目录遍历（路径遍历）：禁止外界指定文件，文件名不能包含目录，限定文件名只有字母和数字 ，创建一份合法的资源名列表（输入..或 / 都可以直接访问服务器目录）
     * 任意文件上传：上传巨大文件会导致DOS（限制文件大小），上传可执行脚本文件（注意文件名后缀限制） 关键字：Upload、write、fileName 、filePath
     * 危险文件包含：代码中包含未经验证的用户输入的能被控制的文件 会导致恶意代码执行
     * 任意文件下载：关键字：download 、fileName 、filePath、write、getFile、getWriter
     *
     *
     *  java命令执行：Runtime 和 ProcessBuilder
     *  Runtime的exec方法底层使用了ProcessBuilder类
     *  processBuilder.start();和runtime.exec()都是执行命令的操作
     *
     * ======================================================
     * 应用场景：
     * OA系统、CMS系统、热门框架、中间件
     *
     *
     * ==================================================
     * 组件漏洞
     * redis
     *  指令安全、端口安全、Lua脚本安全、SSL代理
     *
     * es
     *
     * tomcat
     * 任意文件上传
     * 文件读取和包含
     * 反序列化
     *
     * jboss
     * 反序列化
     *
     * weblogic
     * 反序列化
     *
     * ssrf
     * 任意文件读取、文件上传
     * 远程代码执行
     *
     *
     * nginx
     * 文件解析：
     * 目录遍历
     *
     *
     * docker
     *  docker逃逸 Docker版本 < 18.09.2，runC版本< 1.0-rc6。
     *
     * spring
     * xxe
     * springboot
     * springcloud
     *
     * Hadoop
     *
     *
     *  邮件安全
     *  邮件病毒、邮件炸弹、密码问题、钓鱼邮件
     *  命令注入：POP3和SMTP 两个都是使用时候对用户输入的参数没有过滤 建议白名单过滤
     *
     * ===========================================================================
     *
     * 其他：
     *  硬编码 弱密码 明文 避免弱加密 避免空密码  控制密钥key的长度
     *  避免使用不安全的工具类（Random、SimpleDateFormat（线程不安全 建议使用线程同步机制或者使用ThreadLocal））
     *
     *  未授权访问:配置不当未经授权就可以访问，无需认证就可以访问内部数据
     *  mongo、redis、memcached、JBOSS、docker、es、hadoop
     *  =============================================================================================
     *
     *  常见漏洞点
     *  文件上传处、文章编辑、资料编辑、头像上传、附件上传、任意出现任意文件上传和SQL注入
     *  文件管理（如果程序是能将文件名或者文件路径直接在参数中传递 ）就可能出现任意文件操作、任意文件读取，还可能出现XSS 向页面里输入<等特殊符号 然后被执行
     *  登陆认证，cookie的安全性，
     *  找回密码，可能会出现重置管理员密码的问题
     *
     *
     * 代码审计常见思路：
     * 1：根据敏感关键字回溯参数传递过程（重点关注这些关键字函数使用是否得当）
     * 2 查找可控变量 正向追踪变量传递过程
     * 3 寻找敏感功能点 通读功能点代码
     * 4 直接通读全文代码
     *
     *
     *
     */
}
