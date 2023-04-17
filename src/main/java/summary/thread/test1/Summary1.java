package summary.thread.test1;

public class Summary1 {
    /**
     * 调用start并不是就是运行状态 而是就绪状态 等待CPU调用
     *
     * 
     * callable创建运行方式
     * FutureTask futureTask = new FutureTask<>(new CallableTest());
     * new Thread(futureTask).start();
     *
     * 其他
     * new threadTest().start()
     * new Thread(new RunnableTest()).start()
     *
     *
     * 线程等待与通知
     * wait notify
     * wait方法除了调用notify会唤醒 其他线程如果调用interrupt 该线程会抛异常返回
     * 
     *
     *
     */
}
