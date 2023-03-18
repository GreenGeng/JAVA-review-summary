package code.other;

public class Test11 {
    public static void main(String[] args) {
        int nums[] = {0};
        int[] num = numberOfPairs(nums);
        for(int n:num){
            System.out.println(n);
        }


    }
    public static int[] numberOfPairs(int[] nums) {
        int count=0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len-1;j++){
                if(nums[j] == nums[i] && nums[i]!=-1){
                    count++;
                    nums[i]=-1;
                    nums[j]=-1;
                }
            }
        }


        return new int[]{count,len-count*2};

    }
}
