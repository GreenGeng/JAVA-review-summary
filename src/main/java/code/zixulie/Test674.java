package code.zixulie;

public class Test674 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,3,4,5};
        System.out.println(findLengthOfLCIS(nums));
    }
    public static  int findLengthOfLCIS(int[] nums) {

        int count = 0;
        int len = nums.length;
        int start = 0;
        for (int i = start; i < len; i++) {
            if(i > 0 && nums[i] <= nums[i-1]){
                start = i;
            }
            count = Math.max(count,i-start+1);
        }
        return  count;
    }
}
