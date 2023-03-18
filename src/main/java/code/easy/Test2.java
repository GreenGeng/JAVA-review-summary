package code.easy;

public class Test2 {
    // 二维数组里查找一个值
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=matrix.length-1;
        int j=0;
        while (i >= 0 && j<matrix[0].length){
            if(matrix[i][j] > target){i--;}
            else if(matrix[i][j] < target){j++;}
            else return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int target = 0;
        int [][]arr = {{1,2,0},{1,2,2}};
        System.out.println(findNumberIn2DArray(arr, target));
    }
}
