package code.other;

import java.util.Arrays;

public class Test18 {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int []p = Arrays.copyOf(nums,len*2);
        for(int i=len,j=0;i<len*2 && j<len;i++,j++){
            p[i] = nums[j];
        }
        int start = len -k ;
        for(int index = start;index < len+start;index++){
            System.out.println(p[index]);
        }


    }

    public static void main(String[] args) {
        int nums[] = {-1,-100,3,99};
        rotate(nums,2);
    }
}
