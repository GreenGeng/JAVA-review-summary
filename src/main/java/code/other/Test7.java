package code.other;

import java.util.Stack;

public class Test7 {
    //最长回文串
    public static String longestPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        int len  =s .length();
        for(int i=0;i<len;i++){
            stack.push(s.charAt(i));
        }
        String str = "";
        while (!stack.isEmpty()){
            Character pop = stack.pop();
            str += pop;
        }
        //然后找str和s的公共部分
        return commonStr(str,s);
    }

    //找到两个字符串的公共部分
    public static String commonStr(String s1,String s2){
        String str ="";
        int len = s1.length();
        for(int i=0,j=0;i<len && j <len;i++,j++){
            if(s1.charAt(i) == s2.charAt(j)){
                str+=s1.charAt(i);
            }

        }

        return str;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("abbd"));

    }
}
