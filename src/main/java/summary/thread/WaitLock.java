package summary.thread;

public class WaitLock {
    /**
     * wait是暂停线程 yield和sleep都是暂停
     * notify是唤醒
     * wait需要notify唤醒
     * sleep是到时间之后 获取到CPU调度就会唤醒
     * yield是就绪状态 随时获取到CPU就随时唤醒
     *
     *
     * wait会释放锁 sleep不会
     * 他们都是阻塞状态
     *
     * 因为wait需要notify来唤醒 sleep不需要 sleep到点就醒了
     * 如果wait不释放锁 别的线程就不能获取锁就唤醒不了wait线程了
     *
     * 加锁：读取共享资源的时候 要保证一个时间里只能有一个线程访问 防止多线程同时访问导致数据错乱
     * 就类似mysql数据库里 多个事务去读取一个表里的数据 如果需要修改的话 在读取的时候就需要加锁 别的事务里的sql语句就执行不了
     *
     *
     *
     */
}

