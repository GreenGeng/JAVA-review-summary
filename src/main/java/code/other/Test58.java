package code.other;

public class Test58 {
    public static String reverseLeftWords(String s, int n) {
        String newStr= s+s;
        return newStr.substring(n,n+(s.length()));
    }

    public static void main(String[] args) {

    }
}
