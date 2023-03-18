package code.other;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static String bestHand(int[] ranks, char[] suits) {
        //先判断flush和高牌
        HashMap<Character, Integer> suitMap = new HashMap();

        for(int i=0;i<suits.length;i++){
            if(suitMap.containsKey(suits[i])){
                suitMap.put(suits[i],suitMap.get(suits[i])+1);
            }else{
                suitMap.put(suits[i],1);
            }
        }
        if(suitMap.keySet().size()==1){
            return "Flush";
        }

        HashMap<Integer,Integer> rankMap = new HashMap<>();
        //判断 对子和三条
        for(int i=0;i<ranks.length;i++){
            if(rankMap.containsKey(ranks[i])){
                rankMap.put(ranks[i],rankMap.get(ranks[i])+1);
            }
            else{
                rankMap.put(ranks[i],1);
            }
        }

        List<Integer> valueset = rankMap.values().stream().collect(Collectors.toList());
        valueset = valueset.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        if(valueset.get(0)>=3){
            return "Three of a Kind";
        }
        if(valueset.get(0)==2){
            return "pair";
        }

        if(rankMap.keySet().size()==5)return "High Card";

        return "";
    }

    public static void main(String[] args) {
        int[] ranks = {12,10,12,9,9};
        char suits[] = {'b','b','b','b','c'};
        System.out.println(bestHand(ranks, suits));
    }
}
