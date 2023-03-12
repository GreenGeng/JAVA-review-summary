package code.zixulie;

import java.util.Arrays;
import java.util.Map;

public class Test300 {
    //最长递增子序列问题
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int maxans = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);//其实就是给dp[i]赋值为dp[j]+1
                }
            }
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;

    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        System.out.println(lengthOfLIS(nums));

    }
}
