package code.tree;

import java.util.Deque;
import java.util.LinkedList;

public class Test4 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                3,
                new TreeNode(9),
                new TreeNode(20,new TreeNode(15),new TreeNode(7))
        );
        System.out.println(sumOfLeftLeaves(root));

    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return dfs(root);
    }

    public static int dfs(TreeNode root){
        int sum=0;
        if(root.left!= null) {
//            if (isLeaf(root.left)) {
//                sum += root.left.val;
//            } else {
//                sum += dfs(root.left);
//            }
            sum = isLeaf(root.left) ? sum+root.left.val:sum+dfs(root.left);
        }

        if(root.right!=null){
            sum+= dfs(root.right);
        }

        return sum;

    }

    public static boolean isLeaf(TreeNode node){
        return node.left==null && node.right==null;
    }

}
