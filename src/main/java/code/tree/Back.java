package code.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Back {
    //后序
    public static void main(String[] args) {


    }

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode prev = null;

        if(root == null) return res;
        while (root!=null || !queue.isEmpty()){
            while (root!=null){
                queue.push(root);
                root = root.left;
            }
            root = queue.pop();
            if(root.right==null || root.right==prev){
                res.add(root.val);
                prev  = root;
                root = null;
            }
            else{
                queue.push(root);
                root = root.right;
            }
        }

        return res;
    }
}