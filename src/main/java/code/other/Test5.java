package code.other;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    //全排列
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> llist = new ArrayList<>();
        int len = nums.length;
        for(int i=0;i<len ;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=1;j<len-1;j++){
                swap(nums[j],nums[j+1]);
                list.add(nums[i]);
                list.add(nums[j]);
            }
            llist.add(list);
        }
        return llist;
    }

    public static void swap(int a,int b){
        int t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));

    }
}
