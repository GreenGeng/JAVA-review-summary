package code.other;

public class Test3 {
    public static void main(String[] args) {
        int nums[] = {};
        int[] arr = searchRange(nums, 3);
        for(int a:arr){
            System.out.println(a);
        }


    }

    public static int[] searchRange(int[] nums, int target) {


        int len = nums.length;
        if(len==0) return new int[]{-1,-1};
        int left = 0,right = 0;

        for (int i = 0; i < len; i++) {

            if(nums[i] == target){
                left=i;
                break;
            }
            if(nums[i] != target && i==len-1){
                return new int[]{-1,-1};
            }

        }

        int count = 0;
        for(int j=left;j<len;j++){
            if(nums[j] == target){
                count++;
            }
        }
        right = left+count-1;
        return new int[]{left,right};
    }
}
