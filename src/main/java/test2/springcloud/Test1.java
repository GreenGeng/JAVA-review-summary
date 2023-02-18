package test2.springcloud;

public class Test1 {
    /**
     *Nacos 服务中心，服务注册+服务发现（在一个压缩包里自己手动启动）
     * DiscoveryClient方法是可以Get到服务中心里所有注册的服务
     * Comsumer调用Provider用的是RestTemplate
     * @SpringBootApplication底层有@Configuration注解，所以在启动类里写@Bean和在配置类里写效果是一样的
     *
     * ribbon负载均衡
     * 使用的时候在RestTemplate生成类的上面加上@LoadBalanced注解，默认是轮询算法
     * 如果用别的算法就在Comsumer的配置文件上配置，或者在nacos的web页面上配置权重
     *
     * Sentinel
     * 熔断器，限流，防止服务雪崩
     * 主要是在Sentinel dashboard页面上做配置
     * 服务调用成功就关闭熔断器，否则打开熔断器，还有一个熔断器半开的状态，如果窗口时间到了就重新发请求判断结果
     * 降级的意思是减少可访问的API数量
     * QPS：一秒内请求的次数
     * 也可以对service和参数进行限流，都是在dashboard里配置，对参数进行限流：@SentinelResource
     * sentinel授权：就是给API加黑白名单
     *
     * 消息队列
     * springcloudalibaba里的消息队列是rocketmq
     * 主要作用是流量消峰和解耦
     * 生产：把数据存放在消息队列 类似把数据存库
     * 消费：读取消息队列里的数据 类似从数据库里读取
     * topic类似库名
     * MQ不做业务 只放数据和解耦
     *
     * Gateway
     * 网关，也可以做限流 可以对API进行分组限流
     * 使用是在配置文件里配routes
     * 也可以在nacos里配置限流，或者自定义类限流
     *
     * 需要配置文件
     * ribbon 负载均衡 在消费者里的配置文件配置
     * gateway网关，在nacos或者自己的配置文件里配置
     *
     *
     *
     *
     * 发布订阅模式
     *
     */
}
