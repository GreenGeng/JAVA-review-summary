package code.listnode;


public class Test1 {
    //删除倒数第n个节点
    public static ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        int len = 0;
        ListNode cur = head;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        //因为pre一直变 又不能等于head 就再创建一个节点
        ListNode res = pre;
//        pre=head; 这里不能等于
        while (cur!=null){
            cur = cur.next;
            len++;
        }
        if(n > len) return head;
        //倒数第n就是整数len-n
        for(int i=1;i<len-n+1;i++){
            pre = pre.next;
        }
        if(pre.next==null){
            return pre.next;
        }
        //pre一直在变 不能return pre.next
        pre.next = pre.next.next;
        //返回这个新建节点
        return res.next;
    }

    public static void main(String[] args) {
//        ListNode head = new ListNode(
//                1,new ListNode(2,
//                new ListNode(3,
//                        new ListNode(4,
//                                new ListNode(5,null))))
//        );
        ListNode head = new ListNode(
                1,new ListNode(2,null)
        );
        ListNode node = removeNthFromEnd(head, 2);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

    }
}
