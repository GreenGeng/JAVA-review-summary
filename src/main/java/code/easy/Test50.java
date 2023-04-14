package code.easy;

public class Test50 {
    public static double myPow(double x, int n) {
        double sum = 1;
        if(n >= 0) {
            while (n > 0) {
                n--;
                sum *= x;
            }
        }else{
            while (n < 0) {
                n++;
                sum *= x;
            }
            sum = 1/sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }
}
