package code.tree;

import java.util.*;

public class PreTest {
    //先序 栈

    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> deque = new Stack<>();
        if(root==null)return res;
        deque.add(root);//先根

        while (!deque.isEmpty()){
            TreeNode node = deque.pop();
            res.add(node.val);

            if(node.right!=null){
                deque.add(node.right);
            }
            if(node.left!=null){
                deque.add(node.left);
            }
        }



        return res;
    }
}
