package code.tree;

public class Test110 {
    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }else{
            return Math.abs(height(root.left) -  height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }

    }

    public static int height(TreeNode node){
        if(node == null) return 0;
        else{
           return  Math.max(height(node.left),height(node.right)) +1;
        }
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3,new TreeNode(9,null,null),new TreeNode(20,new TreeNode(15,null,null),new TreeNode(7,null,null)));
        System.out.println(isBalanced(node));
    }
}
