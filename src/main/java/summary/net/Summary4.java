package summary.net;

public class Summary4 {
    /**
     * 流量控制
     * 通过窗口 在tcp首部字段里 窗口字段来判断发送数据的大小 避免缓存溢出
     *
     *
     * TCP只是数据传输有可靠性保障
     * 但是TCP协议并不是安全的协议
     * 所以HTTP虽然是基于TCP 其实也是不安全的
     * 整个TCP/IP的协议都是不安全的
     *
     * websocket是安全的吗
     * 不清楚 因为代码里没有对客户端连接时做身份认证
     *
     *
     *
     * http
     * 1.x 阻塞 半双工协议 加了长链接 断点续传
     * 2.0 使用二进制流传输 1是直接文本传输 不安全并且不方便机器读取
     * 2 升级成了全双工协议 增加了头部压缩（cookie host useragent等信息）
     * 增加了多路复用（一个连接处理多个请求）
     * Http3是使用udp协议 加上quick quick替代tcp的可靠性加上https和部分http2的功能例如头部压缩和多路复用
     * 先有的websocket然后在有的HTTP2
     *
     *
     * HTTP
     * 请求头cookie 响应头set-cookie
     *
     *
     *
     */
}
