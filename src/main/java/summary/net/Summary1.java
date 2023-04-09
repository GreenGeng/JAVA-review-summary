package summary.net;

public class Summary1 {

    /**
     * TCP字节流 UDP是报文
     * TCP首部20个字节  UDP首部8字节
     *
     * tcp可靠
     * 确认序列化、确认应答号、拥塞控制、流量控制、超时重传
     *
     * UDP报文的意思只有一个报文 不做拆分
     * TCP字节流的意思是发送报文时候 会拆分，发送时候带有序号，接收方接受之后按照序号拼装起来
     *
     * TCP数据无边界 UDP总共一个数据
     *
     * 哪些应用层使用了TCP协议传输
     * SMTP、FTP、TELNET
     * 哪些应用层使用了UDP协议传输
     * TFTP(简单文件传输协议)、DNS（也会用到TCP）
     *
     *
     * cookie
     * cookie也是不能跨域的（禁止网站获取其他网站的cookie）
     * cookie的属性有哪些：域名，路径，maxAge（有效值 如果为0就是删除），version
     *
     *
     * 分布式session
     *
     *
     */
}
