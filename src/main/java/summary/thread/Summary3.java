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
     * CPU从程序计数器里获取指令
     * 程序计数器存储的就是当前指令执行到的字节码的位置
     *
     * 线程有自己的空间：栈、ID、程序计数器
     * 共享进程的区域：数据区、方法区、堆
     *
     *
     *
     * 死锁避免
     *  按照加锁顺序获取锁
     *  给锁设置定时器
     *
     *
     *
     * reentrantlock与CAS的关系
     * reentrantlock里的lock方法使用了compareAnsSetState(cas)
     * 如果compareAndSwapSet为true直接获取锁
     * 否则就acquire尝试去等待获取锁
     *
     *
     //Thread.sleep(0)的作用:是为了让GC线程有机会被操作系统选中 从而GC执行
     *
     *
     *
     */
}
