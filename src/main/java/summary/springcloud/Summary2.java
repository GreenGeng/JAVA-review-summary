package summary.springcloud;

public class Summary2 {
    /**
     * 服务之间的远程调用：
     * 基于HTTP的RestFul 和 基于TCP的RPC协议
     *  服务太多 客户端应该怎么访问：通过网关
     *  服务多了怎么管理（nacos服务注册中心）
     *  服务出现问题怎么排查（链路追踪）
     *
     *  springcloud就是把springboot给拆分 然后多个服务之间远程调用
     *  加上了一个网关方便客户端查找
     *  还有一个限流 保护接口
     *  里面的逻辑还是springboot增删改查
     *
     *
     *
     * 服务之间远程调用就是用RestTemplate 或者使用feign
     RestTemplate
     在配置类或者main里定义一个 然后再注入使用
     @Bean
     public RestTemplate restTemplate(){
     return new RestTemplate();
     }
     然后拼接地址去调用

     使用feign
     在主类上开启feign @EnableFeignClients
     创建一个Service接口 把restTemplate的路径拼接写到service里
     @FeignClient(value)里的value是要调用的微服务名称
     然后在@RequestMapping里面指定url
     Demo:
     @FeignClient(value="要调用的微服务的名称")
     public interface service{
     @RequestMapping("/xx/{id}")
     Object findById(@PathVariable int id);
     }



     //feign的原理 里面的name就是服务名称
     feign主要是简化了服务之间的调用
     feign如何实现服务之间的远程调用
     开启feign：@FeignClient和@EnableFeignCLient
     @EnableFeignClient会扫描所有被@FeignClient注解修饰的接口
     -并把他们信息注入到IOC容器中
     -当接口中的方法被调用时
     通过JDK动态代理方式，生成具体的RequestTemplate
     这个对象里封装了HTTP请求需要的全部信息
     Template生成request交给client处理
     （@EnableFeignclient--->@FeignClient--->IOC-->方法调用---->AOP--->RequestTemplate
     --->Rquest对象----->发送给client）









     */




}
