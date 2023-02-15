package test2.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest2 {

    /**
     * 使用volatile
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new MyThread());
            thread.start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(MyThread.counter);

    }
}
class MyThread implements  Runnable{
//    public  volatile static int counter = 0;
    /**
        多线程环境下volatile会出问题 就使用Atomic原子类代替
     *
      */

    public static AtomicInteger counter  = new AtomicInteger(0);
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            counter++;
            counter.incrementAndGet();
        }
    }


}