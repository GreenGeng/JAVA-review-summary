package code.other;

public class Test10 {
    public static long zeroFilledSubarray(int[] nums) {
        long ans = 0L;
        int c=0;
        for(int x:nums){
            if(x!=0){
                c=0;
            }else{
                c++;
                ans+=c;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,2,0,0};
        System.out.println(zeroFilledSubarray(nums));
    }
}
