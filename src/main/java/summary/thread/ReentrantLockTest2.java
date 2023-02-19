package summary.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest2 {
    /**
     * reentrantlock锁可被打断
     */
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            try{
                boolean b = lock.tryLock(1, TimeUnit.SECONDS);
                if(b){
                    System.out.println("t1获得了锁");
                }else{
                    System.out.println("获得锁失败");
                }
            }
            catch (Exception e){
                System.out.println("t1线程被打断了  停止获取");
                return;
            }finally {
                //  释放锁
                lock.unlock();
                System.out.println("t1线程锁释放");
            }

        });

        t.start();

    }

}
