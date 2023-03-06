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
     * spring事务 @Transaction
     *
     *
     *
     *
     * springboot自动装配的原理
     * 通过添加注解@SprigbootApplication或者@EnableAutoConfiguration
     * 会自动去maven中读取每个starter中的factories文件，
     * 文件里配置了所有需要被spring容器创建的bean
     *
     *
     * 循环依赖
     * A创建-》依赖B-》B创建-》依赖A
     * 构造器循环依赖是无法解决的
     * 三级缓存
     * 一级：singletonObjects 缓存的是已经经历里完整生命周期的bean对象
     * 二级：earlySingletonObjects 缓存的是还没经历完整个生命周期的bean对象
     * 三级：singletonFactories 缓存的是ObjectFactory对象工厂
     *
     * A创建--》把A加缓存里--》依赖B--》创建B--》依赖A--》从缓存拿A--》B创建完成--》注入到A里--》结束
     * A在创建时候 在依赖注入之前 把A放到二级缓存里 然后再依赖注入 此时依赖B 就去创建B 因为B依赖A 就去
     * 缓存里找A 找到之后 B创建完成 注入到A里 结束
     * @Todo 等会查下二级缓存就可以 为什么需要三级缓存
     *
     *
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
     */
}
