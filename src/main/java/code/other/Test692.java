package code.other;

import java.util.*;
import java.util.stream.Collectors;

public class Test692 {

    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }


        List<String> list = new ArrayList<>();
        list =  map.keySet().stream().collect(Collectors.toList());
        //给list排序 排序要求是按照map的value大小
        Collections.sort(list, new Comparator<String>() {
            public int compare(String word1, String word2) {
                return map.get(word1) == map.get(word2) ? word1.compareTo(word2) : map.get(word2) - map.get(word1);
            }
        });
        //可以直接截取的
        return list.subList(0, k);

    }

    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }
}
