package test1.sort;

public class QuickSort {
    /**
     * 快排
     */
    public static void main(String[] args) {
        int[] arr = {3,2,1,4};
        sort(arr,0,arr.length-1);
        for(int n:arr){
            System.out.println(n);
        }

    }

    public static void sort(int[] arr,int left,int right){
        //这句话一定要放第一个
        if(left > right) return;
        int i=left;
        int j = right;
        int base = arr[left];
        while (i != j){

            while (i<j && arr[j] >= base){j--;}

            while (i < j && arr[i] <= base){i++;}

            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        arr[left] = arr[i];
        arr[i] = base;

        sort(arr,left,i-1);
        sort(arr,j+1,right);
    }
}
