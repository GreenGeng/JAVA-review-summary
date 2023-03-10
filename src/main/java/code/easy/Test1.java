package code.easy;

import java.util.Arrays;

public class Test1 {
    //找出数组重复的数字
    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1] == nums[i]){
                return nums[i+1];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums=  {2,3,1,0,2,5,3};
        System.out.println(findRepeatNumber(nums));
    }
}
