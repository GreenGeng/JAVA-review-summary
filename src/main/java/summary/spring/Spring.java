package summary.spring;

public class Spring {
    /**
     * springbean生命周期
     * 创建实例，实例化bean
     * 属性注入 实现实现aware接口（方便获取spring上下文核心组件）
     *  前置方法 @PostContruct修饰的方法
     *  实例化方法
     *  后置方法
     * 初始化
     * 使用
     * 销毁（destroy和DisposableBean）
     * （实例只是创建一个对象 初始化是赋值）
     *
     *
     *
     *
     *
     * spring事务 @Transaction
     *
     *
     *
     *
     * springboot自动装配的原理
     * 通过添加注解@SprigbootApplication或者@EnableAutoConfiguration
     * 会自动去maven中读取每个starter中的factories文件，文件里配置了所有需要被
     * spring容器创建的bean
     *
     *
     * 循环依赖
     * @Autowired通过三级缓存来解决循环依赖的
     *
     *
     *
     * JDK 动态代理和AOP的实现
     * 实现InvocationHandler接口重写invoke方法
     * 通过反射的方式创建动态代理对象Proxy.newProxyInstance
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
