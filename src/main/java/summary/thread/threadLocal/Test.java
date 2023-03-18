package summary.thread.threadLocal;


import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        //同一个对象
        Person person = new Person();

        new Thread(new Runnable() {
            @Override
            public void run() {
                person.setName("gy");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(Thread.currentThread().getName()+person.getName());
            }

        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                person.setName("123");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(Thread.currentThread().getName()+person.getName());
            }
        }).start();
    }

}
