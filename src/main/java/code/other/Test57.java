package code.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test57 {

    public static int[] twoSum(int[] nums, int target) {
        int res = 0;
        List<Integer> ans  = new ArrayList<>(2);
        int[] ansarr =  new int[2];
        List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int len  =nums.length;
        for (int i = 0; i < len; i++) {
            res = target-nums[i];
            if(arr.contains(res)){
                ans.add(res);
                ans.add(nums[i]);
                break;
            }
        }

        for(int j = 0;j<ans.size();j++){
            ansarr[j]= ans.get(j);
        }
        return ansarr;

    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,5};
        int target =9;
        int[]  arr = twoSum(nums,target);
        for(int a:arr){
           System.out.println(a);
       }
    }
}
