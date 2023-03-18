package summary.redis;

public class Summary2 {
    /**
     * redis会有线程安全问题吗
     * 不会 他是单线程
     * redis为什么是单线程
     * 因为redis主打的就是效率高，他使用单个CPU绑定一块内存数据，对这块内存数据进行读写的时候都是使用一个CPU完成的
     * 就不需要像多线程还需要等待线程上下文切换  而且内存读取数据就比磁盘快
     *
     * 他的瓶颈在于网络和内存
     */
}
