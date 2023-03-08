package code.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test17 {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums){

        if(nums.length==0) return 0;

        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];
            }

        }



        return i+1;
    }

    public int search(int[] nums, int target) {
        int len = nums.length;
        int l = 0;
        int r = len-1;
        while(l < r){
            int m = (l+r)/2;

            if(nums[m] == target) return m;
            else if(nums[m] < target) {
                l = m+1;
            }
            else{
                r = m-1;
            }
        }

        return -1;

    }


}

