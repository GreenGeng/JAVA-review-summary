package summary.other;

public class Nginx {
    /**
     * nginx怎么做负载均衡
     * 1 轮询
     * 2 weight权重
     * 3 IP_hash(固定IP 把IP映射成hash 只要IP固定 hash就固定 就可以访问特定的服务器)
     *
     *
     * nginx.conf文件里
     * 添加upstream 不加权重weight 默认是轮询
     * upstream{
     *     server xxxx weight=
     *     server xxxx weight=
     * }
     *
     *
     * 反向代理
     * 客户端只知道代理服务器的地址
     * 给代理服务器发请求
     * 代理服务器去给服务器传请求 然后把响应返回给客户端
     * 客户端是不知道真实的服务器 只知道代理服务器的地址
     *
     *
     *
     */
}
