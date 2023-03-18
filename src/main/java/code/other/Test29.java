package code.other;

public class Test29 {
    public static int hammingWeight(int n) {
        int count = 0;
//        while (n%2==1){
//            count++;
//            n/=2;
//        }
//        return count+1;

        for (int i = 0; i < 32; i++) {
            if((n & (1<<i)) != 0){
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
}
