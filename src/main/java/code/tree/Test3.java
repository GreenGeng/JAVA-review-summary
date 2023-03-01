package code.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Test3 {
    //翻转二叉树
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) return null;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            TreeNode left = tmp.left;
            tmp.left = tmp.right;
            tmp.right = left;

            if(tmp.left!=null) {queue.push(tmp.left);}
            if(tmp.right!=null) queue.push(tmp.right);
        }


        return root;

    }

    public static void main(String[] args) {
       TreeNode node =  new TreeNode(4,new TreeNode(2,
                new TreeNode(1),new TreeNode(3)),new TreeNode(7,new TreeNode(6),new TreeNode(9)));
        TreeNode treeNode = invertTree(node);
        //层次遍历
        print(treeNode);

    }

    public static void print(TreeNode node){
        if(node == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            int num = queue.size();
            for (int i = 0; i < num; i++) {
                TreeNode cur = queue.remove();
                if(cur.left!=null) {queue.add(node.left);}
                if(cur.right !=null){queue.add(node.right);}
                System.out.println(cur.val);
            }
        }

    }


}
