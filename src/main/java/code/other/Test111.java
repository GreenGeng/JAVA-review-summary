package code.other;

public class Test111 {
    //最长连续递增子序列
    // 头 长度
    static class Result{
        int index;
        int count;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,5,7,2,1};
        Result result = maxXulie(arr);
        System.out.println(result.index- result.count+1+","+result.count);
    }
    public static Result maxXulie(int[] arr){
        int dp[] = new int[arr.length];
        dp[0] =1;
        int len = arr.length;
        int count = 0;
        Result result = new Result();
        for(int i=1;i<len;i++){
            if(arr[i-1] < arr[i]){
                dp[i] = dp[i-1]+1;
            }
            else{
                dp[i] = 1;
            }
            count = Math.max(dp[i],count);
            result.index = max(dp);
            result.count = count;
        }

        return result;

    }

    public static int max(int dp[]){
        //找到最大值的索引
        int max = dp[0];
        int maxIndex = 0;
        for(int i=0;i<dp.length;i++){
            if(dp[i] > max){
                max = dp[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
