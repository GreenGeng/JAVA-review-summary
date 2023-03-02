package code.other;

public class Test17 {
    public static int tribonacci(int n) {
       if(n==1) return 1;
       if(n==2) return 2;
       int tmp,p=1,q=2;
       for(int i=3;i<=n;i++){
           tmp = p;
           p = q;

           q = tmp+q;
       }
       return q;


    }

    public static void main(String[] args) {
        System.out.println(tribonacci(4));
    }
}
