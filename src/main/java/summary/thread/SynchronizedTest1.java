package summary.thread;

public class SynchronizedTest1 {
    /**
     * syn的原理
     *
     *不可中断：阻塞队列中排队不可中断
     * syn基于JVM内置锁实现，通过内部对象监视器锁，
     * 插入monitorenter和monitorexit指令来实现枷锁
     *
     * 非公平锁 为什么
     *
     * 非公平锁：获取锁不是按照排序顺序分给线程的
     *
     * notifyall是怎么唤醒所有的
     * 循环遍历waitset所有节点 挨个唤醒
     *
     * 自旋锁是在重量级锁
     *
     * reentrantlock可中断 因为是可重入锁
     *
     *
     */
}
