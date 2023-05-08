package code.easy;

import java.util.HashMap;
import java.util.Map;

public class Test205 {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() !=  t.length()) return false;
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        int len =  s.length();
        for(int i=0;i<len;i++){
            char x = s.charAt(i),y = t.charAt(i);
            if((map.containsKey(x) && map.get(x) != y) || (map2.containsKey(y) && map2.get(y) != x)){
                return false;
            }

            map.put(x,y);
            map2.put(y,x);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("add","eeg"));
    }
}

