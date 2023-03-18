package code.other;

import java.util.Arrays;

public class Test30 {
    public static int[] singleNumbers(int[] nums) {
        int[] arr = new int[2];
        Arrays.sort(nums);

        for(int i=1,j=0;i<nums.length && j<2;i++){
            //0
            if(i==0){
                if(nums[i]!=nums[i+1]){
                    arr[j] = nums[i];
                }
            }
            else if(i==nums.length-1){
                // 最右边
                if(nums[i]!=nums[i-1]){
                    arr[j] = nums[i];
                }
            }
            else{
                if(nums[i+1] != nums[i] && nums[i] != nums[i-1]){
                    arr[j] = nums[i];
                    j++;
                }
            }


        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,10,4,1,4,3,3};
        int[] arr  = singleNumbers(nums);
        for(int s:arr){
            System.out.println(s);
        }
    }
}
