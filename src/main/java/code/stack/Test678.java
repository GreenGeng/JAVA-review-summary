package code.stack;

import java.util.Stack;

public class Test678 {
    public static boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            if(s.charAt(i)=='('){
                stack.push(')');
            }
             if(s.charAt(i) =='*'){
                stack.push('*');
            }
            if(s.charAt(i)==')' && !stack.isEmpty()){
                Character pop = stack.pop();
                while (pop=='*'){
                    pop = stack.pop();
                }
                //这里应该再加一个条件 因为并没有完全push到stack里
                if(pop==s.charAt(i) && i==len-1){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkValidString("(*))"));

    }
}
