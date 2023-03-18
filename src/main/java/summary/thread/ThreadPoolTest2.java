package summary.thread;


import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest2 {
    /**
     *  使用ThreadPoolExecutor
     * 
     * @param args
     */
    public static void main(String[] args) {
        ThreadFactory thread = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r);
            }
        };

        //创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 100, TimeUnit.SECONDS, new LinkedBlockingDeque<>(1), new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 4; i++) {
            int task = i;
            executor.submit(()->{
                System.out.println(Thread.currentThread().getName()+","+task);
            });
        }
        executor.shutdown();
    }
}
