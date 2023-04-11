package code.tree;

import java.util.LinkedList;
import java.util.List;

public class Test95 {
    public static List<TreeNode> generateTrees(int n) {

        if(n==0){
            return new LinkedList<>();
        }
        return generateTrees(1,n);
    }
    public static List<TreeNode> generateTrees(int start,int end){

        List<TreeNode> allTrees = new LinkedList<>();
        if(start > end){
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTrees = generateTrees(start, i - 1);
            List<TreeNode> rightTrees = generateTrees(i + 1, end);
            for(TreeNode left:leftTrees){
                for (TreeNode right:rightTrees){
                    TreeNode curTree = new TreeNode(i);
                    curTree.left = left;
                    curTree.right = right;
                    allTrees.add(curTree);
                }
            }
        }
        return allTrees;
    }

    public static void main(String[] args) {

    }
}
