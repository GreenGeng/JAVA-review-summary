package code.other;

import java.util.*;
import java.util.stream.Collectors;

public class Test59 {
    // b站 字符数组里把字符串按照长度排序
    public static void main(String[] args) {
        String[] strs = new String[]{"q","fs","v","abc","e","dfwef"};
        List<String> list = sort(strs);
        list.forEach(System.out::println);
    }
    //map的一个不好的地方就是因为map是无序的 所以他会把原来的顺序打乱了
    //而且map里面的key是不能重复的(不管是字符串作为key还是count作为key都不可取 最好使用list) 如果有字符串值一样就会导致丢失 所以map不可用
    public static List<String> sort(String[] strs){
        List<String> list = new ArrayList<>();
        TreeMap<String,Integer> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < strs.length; i++) {
            int count  = strs[i].length();
            map.put(strs[i],count);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<Map.Entry<String,Integer>> list2 = new ArrayList<>(entries);
        Collections.sort(list2, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });

        list2.forEach(map2->{
            list.add(map2.getKey());
        });

        return list;

    }

    /**
     * 使用list的stream的Comparator.comparing(String::length)
     * **/
    public static List<String> sort2(String[] strs){
        List<String> list = new ArrayList<>();
        for(String str:strs){
            list.add(str);
        }
        return list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
    }
}
