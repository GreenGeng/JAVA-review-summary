package code.other;

import java.util.*;

public class Test14 {
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int row1 = items1.length;
        int row2 = items2.length;
        for(int i=0;i<row1;i++){
            if(map.containsKey(items1[i][0])){
                map.put(items1[i][0],map.get(items1[i][0])+items1[i][1]);
            }else{
                map.put(items1[i][0],items1[i][1]);
            }


        }
        for(int j=0;j<row2;j++){
            if(map.containsKey(items2[j][0])){
                Integer num = map.get(items2[j][0]);
                map.put(items2[j][0],num+items2[j][1]);
            }else{
                map.put(items2[j][0],items2[j][1]);
            }
        }

        for(Map.Entry<Integer, Integer> entries : map.entrySet()){
            List<Integer> list1  = new ArrayList<>();
            list1.add(entries.getKey());
            list1.add(entries.getValue());
            list.add(list1);
            //list要升序
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] itms1= {{1,1},{4,5},{3,8}};
        int[][] itms2= {{3,1},{1,5}};

        System.out.println(mergeSimilarItems(itms1, itms2));

    }
}
