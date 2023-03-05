package code.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test17 {
       static List<String> res = new ArrayList<>();
    public static List<String> letterCombinations(String digits) {
        HashMap<String,String> map = new HashMap<String,String>(){
            {
                put("2","abc");
                put("3","def");
                put("4","ghi");
                put("5","jkl");
                put("6","mno");
                put("7","pqrs");
                put("8","tuv");
                put("9","wxyz");
            }
        };
        backtrace(digits,map,0,new StringBuilder());
        return res;

    }

    static void backtrace(String digits, Map<String , String> map, int index, StringBuilder sb){
        if(index==digits.length()){
            res.add(new StringBuilder(sb).toString());
            return;
        }
        String cur = digits.substring(index,index+1);
        int length = map.get(cur).length();
        for (int i = 0; i < map.get(cur).length(); i++) {
            sb.append(map.get(cur).charAt(i));
            backtrace(digits,map,index+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
