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
     */
}
