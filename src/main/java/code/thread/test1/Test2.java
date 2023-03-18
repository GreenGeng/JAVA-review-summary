package code.thread.test1;

public class Test2 {

   static volatile  int flag = 1;
   public static void main(String args[]){
//       System.out.println("1111");
        new Thread(new print1()).start();
       new Thread(new print2()).start();

   }


}

class print1 extends Thread{
    @Override
    public void run(){
    int i=-2;
        while (i < 20) {
            if (Test2.flag == 1) {
                i+=2;
                System.out.println(i);
                Test2.flag = 0;
            }
        }
    }
}
class print2 extends Thread{
    @Override
    public void run(){
    int i=-1;
        while (i < 20) {
            if (Test2.flag == 0) {
                i+=2;
                System.out.println(i);
                Test2.flag = 1;
            }
        }
    }
}

