package code.other;

public class Test2 {
    public static int search(int[] nums, int target) {

        int index = 0;
        int len = nums.length;
        for (int i = 0; i < len-1-1; i++) {
            if(nums[i+1] < nums[i]){
                index =  i;
            }
        }
        int base = nums[0];
        if(base == target){return 0;}
        if(target < base){
            for(int i=index+1;i<=len-1;){
                if(target == nums[i])return i;
                else if(target < nums[i]){
                    return -1;
                }else{
                    i++;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1};

        System.out.println(search(nums, 1));
    }
}
