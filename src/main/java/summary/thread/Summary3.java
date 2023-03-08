package summary.thread;

public class Summary3
{
    /**
     *
     *  乐观锁和悲观锁场景
     *  悲观的话 每次只能有一个线程可以使用
     *  乐观锁实现：版本号或者CAS
     *  乐观锁的场景：多读场景
     *  悲观锁的场景：多写场景
     *
     *
     *  cpu与内存读写不一致 然后加了一层缓存 就会导致数据不一致问题
     *  然后就加了一个缓存一致性协议 缓存协议又减慢了数据读取的速度
     *  又加了一个缓存队列 缓存队列又导致编码顺序乱序问题 然后又加了一个
     *  Store屏障
     *
     *  Java锁的种类
     *  synchronized和reentrantlock都是可重入锁
     *  cas是乐观锁
     *  synchronized reentrantlock是悲观锁
     * synchronized是非公平锁
     * reentrantlock可公平可非公平
     * synchronized和reentrantlock都是互斥锁
     *
     *
     *
     * 终止一个线程
     * stop
     * interrupt
     * volatile修饰的flag while(!flag){执行 flag=true停止}
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
