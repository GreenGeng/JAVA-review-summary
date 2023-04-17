package code.sort;

public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,3};
        quickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr,int left,int right){

        if(left > right)return;
        int i=left;
        int j = right;
        int base = arr[left];

        while (i != j){
            while (i < j && arr[j] >= base) {j--;}
            while (i < j && arr[i] <= base){i++;}

            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }


        quickSort(arr,left,i-1);
        quickSort(arr,j+1,right);
        arr[left] = arr[i];
        arr[i] = base;
    }
}
