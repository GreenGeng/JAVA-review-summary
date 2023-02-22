package summary.thread.threadLocal;

public class Summary {
    /**
     *
     * 简述ThreadLocal
     *
     * Map里的Entry是一个JavaBean里面有key 和 value
     *  for(Map.Entry<Integer,Integer> e:map.entrySet()){
     *             System.out.println(e.getKey()+","+e.getValue());
     *         }
     *
     *
     *  threadlocal内存泄漏
     *  解决：使用了ThreadLocal对象之后 手动remove
     *  原因：线程被回收了 但是ThreadLocal里的entry还没被回收 ，因为ThreadLocalmap是被线程对象强引用的，
     *  ThreadLocalMap也强引用指向的entry对象，没有回收就造成了泄漏
     *
     *
     *
     *
     *  ThreadLocal是线程本地存储机制 线程访问到Threadlocal修饰的变量的时候 会在线程本地复制一份 达到线程隔离的作用
     *  底层是通过ThreadLocalMap实现的
     *  每个线程对象（不是ThreadLocal对象）都有一个ThreadLocalMap kv格式 key是ThreadLocal对象 value是要缓存的值
     *  应用场景：连接管理
     *
     *
     *
     */
}
