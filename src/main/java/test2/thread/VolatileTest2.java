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
     多线程环境下volatile会出问题 就使用Atomic原子类代替(Atomic就是CAS)
     Atomic类的缺点：
     ABA问题
     CAS会自旋浪费CPU资源

     为什么volatile不保证原子性?
     修改volatile变量：
     先读取volatile变量到本地
     修改变量
     把值写回去、
     这些都是线程不安全的 其他线程也可操作 原子性是要通过锁来保证、


     为什么自旋锁可以保证原子性？
     因为他调用了底层的unsafe类里的native方法 JAVA直接操作CPU指令

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