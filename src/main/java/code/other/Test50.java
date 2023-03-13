package code.other;

public class Test50 {
    public static char firstUniqChar(String s) {

        int start = 0;
        int len = s.length();
        if(len==0){
            return ' ';
        }
        for (int i = start,j=i+1; i<len && j < len ; ) {
            while(s.charAt(j) != s.charAt(i)){
                j++;
                if(j==len-1){
                    return s.charAt(i);
                }
            }
                i++;
                start = i;
        }
        return s.charAt(start);
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("cc"));
    }
}
