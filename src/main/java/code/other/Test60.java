package code.other;

public class Test60 {
    public static void main(String[] args) {

        System.out.println(recur(1));
    }
    public static int recur(int num){
        if(num >= 10) return num;
        num++;
        return recur(num);
    }

}
