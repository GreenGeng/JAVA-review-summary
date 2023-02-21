package summary.thread;

public class ThreadPoolTest3 {
    /**
     *
     * 线程池的状态
     * 线程池和线程的状态完全不一样
     * 线程池的状态有：
     * 运行中：创建好线程池就会进入此状态
     * 关闭：不再接受新任务，但是会把等待队列里的任务处理完
     * 停止：不再接受新任务，会中断正在执行的任务，丢掉还在等待的任务
     * 整理：所有的任务执行完，线程数降为0
     * 销毁：执行terminated方法
     *
     *
     * 线程池中多余的线程是怎么被回收的
     * @Todo 后期看下线程池里的源码
     * 循环判断任务是否为空，如果不为空，就执行任务，为空就退出循环
     * 执行processWorker方法，把工作线程移除
     *
     *
     *
    //为什么不用Executors创建线程池
    * 因为fixed和SingleThreadPool允许请求队列的长度为Integer.MAX_VALUE会堆积大量请求导致OOM
     * fixed和Single都使用的是LinkedBlockingQueue 是链表实现的有界阻塞队列 容量可以设置可以不设置，如果没有设置容量
     * 就是默认最大值，就会出现OOM，如果是数组实现的有界队列，就必须要设置容量，
     * Cached和ScheduledThreadPool允许创建的线程数量为Integer.MAX_VALUE 创建大量线程导致OOM
     *
    //多线程和异步的区别
     *
     *
     */
}
