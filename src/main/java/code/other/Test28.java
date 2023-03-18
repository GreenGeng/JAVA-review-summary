package code.other;

public class Test28 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = exchange(nums);
        for(int n:res){
            System.out.println(n);
        }

    }
    public static  int[] exchange(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            if(nums[i] %2==0){
                res[right--] =  nums[i];
            }else{
                res[left++] = nums[i];
            }
        }
        return res;
    }
}
