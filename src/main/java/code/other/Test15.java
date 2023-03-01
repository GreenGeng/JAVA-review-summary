package code.other;

import java.util.*;
import java.util.stream.Collectors;

public class Test15 {
    //最常见的单词
    public static String mostCommonWord(String paragraph, String[] banned) {
        String str = "";

        paragraph = paragraph.replace(".","").replace(",","");
        String[] para = paragraph.split(" ");
        TreeMap<String,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for(String p:para){
            if(map.containsKey(p)){
                map.put(p,map.get(p)+1);
            }else {
                map.put(p,1);
            }
        }
        for(Map.Entry<String, Integer> entries : map.entrySet()){
            if(!Arrays.stream(banned).collect(Collectors.toList()).contains(entries.getKey())){
                str =  entries.getKey().toLowerCase();
            }
        }
        return str;

    }

    public static void main(String[] args) {
        String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        System.out.println(mostCommonWord(para, banned));

    }
}
