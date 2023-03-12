package code.zixulie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test119 {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int longest = 0;
        for (int n:set){


        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
