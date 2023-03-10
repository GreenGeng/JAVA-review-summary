package code.sort;

public class TestDobbo {
    //冒泡
    public static void main(String[] args) {
        int nums[] = {1,2,3,2};
//        dubbo(nums);
        quickSort(nums,0,nums.length-1);
        for(int n:nums){
            System.out.println(n);
        }

    }

    public static void dubbo(int[] nums){
        int len  = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-1-i; j++) {
                if(nums[j] > nums[j+1]){
                    int t = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }


    public static void quickSort(int []nums,int left,int right){
        if(left > right) return;
        int i = left;
        int j = right;
        int base = nums[left];
        while (i < j){
            while (i < j && nums[j] >= base){j--;}
            while (i < j && nums[i] <= base){i++;}
            int t  = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }


        quickSort(nums,left,i-1);
        quickSort(nums,j+1,right);

        nums[left] = nums[i];
        nums[i] = base;
    }
}
