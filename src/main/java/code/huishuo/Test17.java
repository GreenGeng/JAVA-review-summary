package code.huishuo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test17 {
    //电话号码组合
    public static List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if(digits.length()==0){
            return combinations;
        }
         Map<Character,String> map = new HashMap<Character,String>() {{
                put('2',"abc");
                put('3',"def");
                put('4',"ghi");
                put('5',"jkl");
                put('6',"mno");
                put('7',"pqrs");
                put('8',"tuv");
                put('9',"wxyz");
            }
        };
        combinations = combine(map,digits);

//        backtrace(combinations,map,digits,0,new StringBuffer());
        return combinations;
    }

    public static List<String> combine(Map<Character,String> map,String digit){
        List<String> combinations = new ArrayList<>();
        int len = digit.length();
        if(len==0){
            return combinations;
        }
        for (int i=0;i<len;i++){


        }

        return combinations;
    }
    public static void backtrace(List<String> combinations,Map<Character,String> map,String digits, int index,StringBuffer sb){
        if(index == digits.length()){
            combinations.add(sb.toString());
        }
        else {
            char digit = digits.charAt(index);
            String letters = map.get(digit);
            int letterCount = letters.length();
            for(int i=0;i<letterCount;i++){
                sb.append(letters.charAt(i));
                backtrace(combinations,map,digits,index+1,sb);
                sb.deleteCharAt(index);
            }

        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
