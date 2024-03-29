package summary.thread;

public class Summary1 {
    /**
     *
     * 线程池的工作流程
     * 就是corePoolSize、maxPoolSize、和阻塞队列的关系
     *
     * Sleep wait
     * wait需要在同步上下文中调用，用notify唤醒，是实例方法，会释放锁 线程阻塞 会释放CPU
     * sleep不需要，超时就能唤醒，静态方法，不释放锁 线程阻塞 会释放CPU
     * 线程阻塞 就会让出CPU 让CPU去执行其他线程 不然一直占着CPU浪费资源
     *
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
     * 偏向锁
     * 在锁对象的对象头里会记录当前获取到锁的线程ID 下次该线程在来获取锁就可以直接获取
     * 轻量级锁
     * 轻量级锁是由自旋锁来实现的 不会线程阻塞
     * 自旋锁
     * 线程一直循环去获取锁 防止CPU从用户态转内核态
     * 自旋锁次数过多都没有获得锁就会成为重量级锁 导致线程阻塞
     *
     *
     * 线程池里的线程个数怎么设置
     * CPU密集型（CPU参与的时间较多） ：CPU核数+1
     * IO密集型（IO比较多）：CPU*2
     * 混合型
     *
     * IO：磁盘IO、网络IO
     * 磁盘IO：文件读写、数据库读写
     * 网络IO：发请求
     *
     *
     *
     * yield和sleep的区别
     * 两者很像  都是会放弃当前CPU
     * sleep让给其他线程运行是不考虑线程优先级的 yield只会让给相同或者更高优先级的线程
     * sleep进入阻塞状态 yield是就绪状态可能很快就又能执行
     * sleep会抛异常 yield没有声明抛异常
     * sleep和yield都不会释放锁（锁是共享的数据资源）
     *
     *
     * IO多路复用
     * IO文件的输入与输出
     * 多路复用：单个线程管理多个IO流
     *
     * BIO阻塞 相当于synchronized
     * NIO 相当于自旋
     *
     *
     * 线程池里多余的线程
     * 在keepAliveTime结束后就会被回收
     *
     * synchronized和lock都是可重入锁 但是lock可以中断 synchronized不行
     *
     *  synchronized为什么不能中断
     *  他是在获取锁的阻塞的时候是不能中断的
     *
     *  synchronized原理
     *  主要是通过enter和exit指令，线程遇到enter指令，如果获取锁就计数器+1 没有获取锁就等待
     *  遇到exit指令 计数器就-1 计数器为0的时候 释放锁
     *
     *
     *  lock是乐观锁 为什么
     * 乐观锁的实现主要是：CAS机制和版本号机制
     * 悲观锁 一个时间点只有一个线程可以获取锁 （类似数据库排他锁）
     * lock是使用cas+volatile实现的
     *
     *
     *  synchronized为什么是非公平锁
     *
     *
     * redis分布式锁里的setnx和cas挺像的
     *（cas vab）
     *
     *
     * 多线程去访问同一个共享资源 就会出现 线程不安全的问题 所以就通过加锁的方式
     * 在一个时间里只能有一个线程能访问该资源
     *
     * 单核CPU只能执行一个线程
     * 如果要start一个线程就需要CPU调度
     *
     */
}
