package summary.thread;

public class Test1 {

    private  int count;
    public static void main(String[] args) {

        Test1 test  = new Test1();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                test.add();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                test.add();
            }
        });

        t1.start();
        t2.start();
        System.out.println(test.count);
    }


    public synchronized void add(){
        count++;
    }

}
