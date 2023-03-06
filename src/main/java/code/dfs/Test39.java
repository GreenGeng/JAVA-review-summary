package code.dfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Test39 {
    // 全排列
    // 39
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if(len==0){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates,0,len,target,path,res);

        return res;

    }
    public static void print(){
        System.out.println("111");
    }
    public void bfs(){
        print();
    }

    public static void dfs(int[] candidates,int begin,int len,int target,Deque<Integer> path,List<List<Integer>> res){
        if(target < 0){
            return;

        }
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {
            path.addLast(candidates[i]);
            dfs(candidates,i,len,target-candidates[i],path,res);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
//        int[] nums = {2,3,4};
//        int target = 7;
//        System.out.println(combinationSum(nums, target));

        Integer a = (2);
        Integer b = (2);
        System.out.println(a==b);// true
    }


}