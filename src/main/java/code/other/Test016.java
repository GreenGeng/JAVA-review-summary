package code.other;

public class Test016 {
    public static double myPow(double x, int n) {
        double sum = x;
        while (n > 1){
            sum *=x;
            n--;
        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
    }
}
