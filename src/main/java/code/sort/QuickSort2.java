package code.sort;

public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
//        quickSort(arr,0,arr.length-1);
//        for(int i:arr){
//            System.out.println(i);
//        }

        System.out.println(halfFind(arr,5));
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left > right)return;
        int i=left;
        int j = right;
        int base = arr[left];

        while (i != j){
            while (i < j && arr[j] >= base){j--;}
            while (i < j && arr[i] <= base){i++;}

            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        arr[left] = arr[i];
        arr[i] = base;
        quickSort(arr,left,i-1);
        quickSort(arr,j+1,right);
    }

    //
    public static int halfFind(int arr[],int target){
        int left =  0;
        int right = arr.length-1;

        while (left < right){
            int mid =  (left+right)/2;
            if(target == arr[mid])return mid;
            else if(target > arr[mid]) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
