package summary.thread.test1;

public class RunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new RunnableTest()).start();
    }
}
