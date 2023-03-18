package code.other;

import java.util.ArrayList;
import java.util.List;

public class Test22 {
    static ArrayList[] cache = new ArrayList[100];

    public static List<String> generate(int n){
        if(cache[n] != null){
            return cache[n];
        }
        ArrayList<String> ans  = new ArrayList<>();
        if(n==0){
            ans.add("");
        }
        else{
            for (int i = 0; i < n; i++) {
                for (String left:generate(i)){
                    for(String right:generate(n-1-i)){
                        ans.add("("+left+")"+right);
                    }
                }
            }
        }
        cache[n] = ans;
        return ans;
    }



    public static List<String> generateParenthesis(int n) {
        return generate(n);
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
