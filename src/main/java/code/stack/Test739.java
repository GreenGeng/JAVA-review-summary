package code.stack;

import java.util.Arrays;
import java.util.Stack;

public class Test739 {
    // 单调栈
    public static int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] results = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            int temp = temperatures[i];
            while (!stack.isEmpty() && temp > temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                results[prevIndex] = i-prevIndex;
            }
            stack.push(i);
        }
        return results;
    }

    public static void main(String[] args) {
        int[] temperatures =  {73,74,75,71,69,72,76,73};
        int[] nums = dailyTemperatures(temperatures);
        for(int n:nums){
            System.out.println(n);
        }

    }
}
