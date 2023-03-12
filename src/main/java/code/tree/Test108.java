package code.tree;

public class Test108 {
    //将有序数组转成二叉搜索
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);


    }
    public static TreeNode helper(int[] nums,int left,int right){
        if(left > right) return new TreeNode();
        int mid  =  (left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums,left,mid-1);
        node.right = helper(nums,mid+1,right);
        return node;
    }

    public static void main(String[] args) {
    }




}
