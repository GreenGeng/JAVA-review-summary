package summary.thread.test1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest implements Callable {


    @Override
    public String call() throws Exception {
        return "hi";
    }

    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask<>(new CallableTest());
        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get());
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
