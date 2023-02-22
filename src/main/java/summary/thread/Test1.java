package summary.thread;

public class Test1 {
    /**
     *
     * 线程池的工作流程
     * 就是corePoolSize、maxPoolSize、和阻塞队列的关系
     *
     * Sleep wait
     * wait需要在同步上下文中调用，用notify唤醒，是实例方法，会释放锁
     * sleep不需要，超时就能唤醒，静态方法，不释放锁
     *
     * Thread的sleep会进入什么状态
     * 阻塞态，因为就绪态的话，CPU是随时可以调度的，在sleep这段时间，cpu调度不到该线程，所以是阻塞态，
     * 等结束之后就是就绪态
     *
     *
     * 如何查看线程死锁
     * jstack命令
     *
     * 线程之间如何通信
     *
     *
     *
     *
     */
}
