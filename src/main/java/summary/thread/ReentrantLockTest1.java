package summary.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest1 {

    /**
     * reentrantlock的使用
     * lock是放在try外面的 并且要紧跟
     *
     * 可重入锁的意思就是
     * 同一个线程在外层方法获取到锁的时候 内层方法会自动获取锁 不需要等待外层方法释放锁
     *
     *、reentrantlock的缺点
     * 不能保证原子性
     *
     */
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        //可重入锁
        lock.lock();
        try{
            System.out.println("main获得锁");
            m1();
        }catch (Exception e){
        }finally {
            lock.unlock();
            System.out.println("main释放");
        }
    }

    public static void m1(){
        lock.lock();

        try {
            System.out.println("m1获得锁");
        }
        catch (Exception e){

        }finally {
            lock.unlock();
            System.out.println("m1释放锁");
        }
    }



}
