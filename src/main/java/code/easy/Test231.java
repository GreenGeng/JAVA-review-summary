package code.easy;

public class Test231 {
    public static boolean isPowerOfTwo(int n) {
        if(n==0) return true;
        while (n!=1){
            if(n%2==0){
                n/=2;
            }else{
                //这里要有return
                //因为while的条件是不等于
                // 没有退出条件就可能会死循环
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }
}
