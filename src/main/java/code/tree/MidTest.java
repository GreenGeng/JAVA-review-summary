package code.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MidTest {
    //中序 左根右

    public static void main(String[] args) {

    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        while (root!=null || !stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root = root.left;
            }//左

            root = stack.pop();
            res.add(root.val);//根
            root = root.right;//右
        }
        return res;

    }
}
