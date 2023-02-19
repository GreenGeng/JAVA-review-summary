package summary.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest1 {
    /**
     * 线程池使用 Executors
     * 使用Executors创建线程池的时候
     * 启动线程使用的是submit方法或者execute
     *
     * 为什么不推荐使用Executors
     * 因为会出现OOM 后期可以写个
     *
     * @param args
     */
    public static void main(String[] args) {
//        ExecutorService threadpool = Executors.newFixedThreadPool(2);
        ExecutorService threadpool = Executors.newCachedThreadPool();

        threadpool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        threadpool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

    }
}
