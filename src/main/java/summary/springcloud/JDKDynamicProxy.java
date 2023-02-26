package summary.springcloud;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理就是实现InvocationHandler接口重写invoke方法
 * 代理对象是Java反射创建的对象
 *
 *
 */
public class JDKDynamicProxy implements InvocationHandler {
    private Object obj;
    /**
     * 生成代理对象实例
     *
     */
    public Object getInstance(Object target){
        this.obj = target;
        //这个是反射创建动态代理对象
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行");
        Object invoke = method.invoke(obj, args);
        System.out.println("执行完毕");
        return invoke;
    }

}
