package summary.springcloud;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProxyTest {
    //动态代理 通过Java反射的方式创建代理对象
    @Test
    public void testDynamicProxy(){
        List<String> list = (List) new JDKDynamicProxy().getInstance(new ArrayList<String>());
        list.add("hello");
        System.out.println(list);
    }


    //通过代理类去调用方法
    @Test
    public void testStaticProxy(){
        StaticProxy proxy = new StaticProxy(new Student());
        proxy.dowork();

    }

}
