package summary.net;

public class Summary {
    /**
     * NIO
     * 同步非阻塞IO
     *
     * IO是以流的形式 NIO是以块的形式
     *
     *
     * NIO的场景
     * 服务器需要支持大量的长时间连接
     * jetty netty tomcat zookeeper都是NIO的方式实现的
     * 数据从通道读取到缓冲区 或者  从缓冲区写到通道里
     *
     * 先获取channel
     * 创建buffer缓冲区
     * 将数据从channel读到buffer
     *
     * 解决的问题：
     * 解决了阻塞
     *
     *
     *
     * http1.1增加了长链接 但是是串行的文件传输效率低
     * http2.0使用二进制格式 多路复用 头部压缩（缩短header的大小 避免重复header信息传输）
     * keep-alive就是长链接
     *
     *
     * 根节点 就是 根服务器 总共13台
     *
     *
     *
     * 添加 删除 修改 使用post 不是只是添加
     * 获取使用get
     *
     *
     *
     * 非对称加密的弊端
     * 速度慢  只适合对少量数据加密
     * 计算机资源使用率高
     * 私钥易丢失
     * 密钥位数多
     *
     *
     *
     *
     */
}
