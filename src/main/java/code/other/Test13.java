package code.other;

public class Test13 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] nums = new int[k];
        sort(arr,0,arr.length-1);

        for(int i=0;i<k;i++){
            nums[i] = arr[i];
        }
        return nums;
    }
    public static void sort(int[] nums,int left,int right){
        if(left > right) return;
        int i=left,j=right;
        int base = nums[left];

        while(i!=j){
            while(i<j && nums[j] >= base){j--;}
            while(i<j && nums[i] <= base){i++;}

            int t = nums[i];
            nums[j]=nums[i];
            nums[i] = t;
        }
        nums[left] = nums[i];
        nums[i]= base;

        sort(nums,left,i-1);
        sort(nums,j+1,right);
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,2,4,2,2,3,1,4};
        int[] nums = getLeastNumbers(arr, 8);
        for (int n:nums){
            System.out.println(n);
        }

    }
}
