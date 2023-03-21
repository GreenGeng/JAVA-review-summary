package summary.net.websocket;

public class Summary1 {
    /**
     * nio、socket、websocket
     *
     * websocket跟http都是协议
     * netty和tomcat是服务器
     * nio是  new IO
     * IO 网络传统IO
     *
     *
     *  nio编程
     *  常规IO是基于字节流和字符流，会阻塞
     *  NIO是基于通道和缓冲区，从缓冲区里读或者写入到缓冲区里
     *  非阻塞：把数据从通道读写到缓冲区后可以做别的事情
     *
     *
     *  websocket 是基于tcp的一种新的协议
     *  socket 不是协议
     *
     *
     *
     *  netty是一个网络框架
     *  netty可以实现websockte通信
     *  tomcat是基于http请求的服务器
     *  netty可以自定义协议，基于nio
     *
     *
     *
     *  websocket的实现
     *  先注入 ServerEndpointExporter这个对象是开启websocket
     *  前端编写ajax 调用后端接口 @ServerEndpoint(value = "/p2p") 这个是前端给服务器发送连接请求
     *  然后里面就是具体的实现
     *  @OnOpen
     *  @OnClose
     *  @OnMessage
     *  里面的Session就是从前端传递的session
     *
     *
     *
     *
     *  websocket（不需要前端轮询）
     *  基于TCP，实现了全双工通信
     *  场景：弹幕，实时监控，网页聊天
     *
     *
     *
     *  http1.x是半双工，服务器端无法向客户端发请求（HTTP协议）
     *  半双工：通信只能有一方发起
     *  解决：客户端通过频繁请求实现长轮询，这样会很消耗资源
     *
     *
     * http握手有三次过程
     * websocket握手就一次 握手基于HTTP
     * websocket主要就是三个步骤 连接 发请求  关闭
     *
     *  获取当前用户登录名用HttpSession
     *
     */
}
