package code.sort;

public class TestQuick {

    public static void main(String[] args) {
        int []nums = {2,3,1,4};
        sort(nums,0,nums.length-1);
        for(int n:nums){
            System.out.println(n);
        }

    }

    public static void sort(int[] nums,int left,int right){
        if(left > right) return;

        int i=left;
        int j = right;
        int base = nums[left];

        while (i < j){
            while (i < j && nums[j] >= base){j--;}
            while (i < j && nums[i] <= base){i++;}
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }

        nums[left] = nums[i];
        nums[i] = base;

        sort(nums,left,i-1);
        sort(nums,j+1,right);
    }

}
