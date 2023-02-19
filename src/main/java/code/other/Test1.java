package code.other;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    /**
     * 括号生成 不会写 看答案的
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static ArrayList<String> generateParenthesis (int n) {
        // write code here
        ArrayList<String> arr = new ArrayList<>();
        if(n == 0) return null;
        String init = "()";
        if(n==1){
            arr.add(init);
            return arr;
        }
        HashSet<String> set = new HashSet<>();
        ArrayList<String> lastRes = generateParenthesis(n-1);
        for(String itm : lastRes){
            for (int i = 0; i < 2*n-1; i++) {
                String prefix;
                if(i==0) prefix = "";
                else prefix = itm.substring(0,i);

                String end ;
                if(i==2*n-2) end="";
                else end=itm.substring(i);
                set.add(prefix+"()"+end);
            }
        }

        for(Iterator<String> it= set.iterator();it.hasNext();){
            arr.add(it.next());
        }
        return arr;


    }
}
