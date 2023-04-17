package summary.thread.test1;


public class ThreadTest extends Thread{
    public static void main(String[] args) {
        new ThreadTest().start();
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

}
