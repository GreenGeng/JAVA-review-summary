package code.tree;

import java.util.*;

public class Test1 {
    /**
     * 相同的树
     *
     */
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        List<Integer> plist = preOrder(p);
        List<Integer> qlist = preOrder(q);
        return plist==qlist;

    }
    public static List<Integer> preOrder(TreeNode p){
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> deque = new Stack<>();
        deque.add(p);
        while (!deque.isEmpty() || p!=null){
            p = deque.pop();
            if(p.right!=null) deque.add(p.right);
            if(p.left!=null) deque.add(p.left);

        }

        return list;
    }

    public static void main(String[] args) {

    }
}
