package code.other;

public class Test61 {
    //二分
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        System.out.println(halfSort(arr,target));
    }
    public static int halfSort(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;

        while (left <= right){
            int mid  = (left+right)/2;
            if(target == arr[mid]) return mid;
            else if(target > arr[mid]) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
