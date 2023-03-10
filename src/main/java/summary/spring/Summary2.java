package summary.spring;

public class Summary2 {
    /**
     *  ioc和aop
     *  ioc控制反转 之前通过new方式创建对象 现在是通过spring容器来创建对象
     *  aop：把非业务代码抽取出来 减少代码耦合性 对方法进行增强 可以在方法前执行一些操作  在方法后执行一些操作
     *
     *  before、after、连接点、切入点
     *
     *
     *
     *
     *
     *  ioc的bean加载过程
     *
     *
     *  约定大于配置
     *
     *
     * springboot的自动装配
     * 通过@EnableAutoConfiguration注解找到spring.factories文件中
     * 找到所有对应的配置类 然后将这些配置类加载到spring容器中
     *
     *
     * springboot自动装配相比spring mvc的优缺点
     *
     *
     * 反射的优缺点
     * 缺点：可读性下降 破坏了代码的抽象性（因为他绕过了访问修饰符的限制）
     * 优点；提高来代码的灵活性，轻松获取到类里的方法和属性
     * 哪些地方用到了反射
     * IOC 读取XML文件 然后反射创建对象
     * AOP 使用Proxy代理类 getInstance动态创建代理对象
     *
     *
     *
     *
     *
     * @Autowired和@Resource
     * @Autowired默认是按照type装配
     * @Resource是按照name装配
     *
     *
     * spring AOP原理=》AOP
     *
     *
     *
     * AOP是面向切面
     * 动态代理是动态代理
     * 两个不一样
     * 但是AOP用到了动态代理
     *
     *
     *
     *
     */
}
