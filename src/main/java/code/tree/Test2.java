package code.tree;

import java.util.Deque;
import java.util.LinkedList;

public class Test2 {
    //对称二叉树
    public static boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }
    public static boolean check(TreeNode left,TreeNode right){
        Deque<TreeNode> queue = new LinkedList<>();

        queue.push(left);
        queue.push(right);

        while (!queue.isEmpty()){
            left = queue.pop();
            right = queue.pop();
            if(left==null && right==null) continue;

            if((left.val != right.val) || (left==null || right==null) ){
                return false;
            }
            //加载的顺序
            queue.offer(left.left);
            queue.offer(right.right);

            queue.offer(left.right);
            queue.offer(right.left);
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode root =  new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),
                new TreeNode(2,new TreeNode(4),new TreeNode(3)));
        System.out.println(isSymmetric(root));
    }
}
