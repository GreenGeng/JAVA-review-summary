package summary.thread;



public class Test1 {
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            add();
        });

        Thread t2 = new Thread(() -> {
            add();
        });
        t1.start();
        t2.start();
        //暂停当前线程
        Thread.sleep(300);
        System.out.println(count);
    }

    public synchronized static void add(){
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }



}
