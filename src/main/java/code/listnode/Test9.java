package code.listnode;

public class Test9 {
    public static void main(String[] args) {
        ListNode root = new ListNode(
                1,new ListNode(2,new ListNode(3,null))
        );
        ListNode cur = reverse(root);
        while(cur!=null){
            System.out.println(cur.val);
            cur = cur.next;
        }


    }
    public static ListNode reverse(ListNode root){
        ListNode pre  = null;
        while (root!=null){
            ListNode cur = root.next;
            root.next = pre;
            pre = root;
            root = cur;
        }

        return pre;
    }
}
