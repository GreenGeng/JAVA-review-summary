package code.dynamic;

import java.util.Arrays;
import java.util.Stack;

public class Test3 {
    // 503 下个更大元素
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret,-1);

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n*2-1;i++)
        {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]){
                ret[stack.pop()] = nums[i % n];
            }
            stack.push(i % n);
        }
        return ret;

    }


    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] arr = nextGreaterElements(nums);

        for(int a:arr){
            System.out.println(a);
        }
    }
}
