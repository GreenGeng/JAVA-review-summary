package code.other;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test8 {
    public static int minimumOperations(int[] nums) {
        int count = 0 ;
        int min=1;
        while (min != 0){
            for(int i=0;i<nums.length;i++){
                    // 找到里面最小值除了0
                min = minNums(nums);
                if(min==0)break;
                //这里应该是把所有都-min
                for(int j=0;j<nums.length;j++){
                    if(nums[j]>0){
                        nums[j] = nums[j]-min;

                    }
                }
                count++;
            }
        }

        return count;
    }

    public static int minNums(int[] nums){

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> list2 = list.stream().filter(l -> l != 0).collect(Collectors.toList());

        if(list2.size()==0){
            //全是0 就直接返回0
            return 0;
        }
        int min = list2.get(0);
        for(int i=1;i<list2.size();i++){
                if(list2.get(i) < min){
                    min = list2.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));
    }
}
