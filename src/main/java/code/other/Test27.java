package code.other;

public class Test27 {
    public static int removeElement(int[] nums, int val) {

        int len  = nums.length;
        int left = 0;

        for(int right=0;right<len;right++){
            if(nums[right] != val){
                nums[left] = nums[right];
                left ++ ;
            }
        }

        return left;

    }

    public static void main(String[] args) {

        int nums[] = {3,2,2,3};
        int val = 3;

        System.out.println(removeElement(nums, val));

    }
}
