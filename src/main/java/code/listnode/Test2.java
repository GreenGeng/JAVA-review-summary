package code.listnode;

public class Test2 {
    //重写一遍删除倒数第N个节点
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode pre = new ListNode(-1);
        pre.next = head;
        int len = 0;

        ListNode res = pre;
        while(cur !=null){
            len++;
            cur = cur.next;
        }
        if(n > len) return head;
        for(int i=1;i<len-n+1;i++){
            pre = pre.next;
        }
        if(pre.next==null)return res.next;
        pre.next = pre.next.next;

        return res.next;

    }

    public static void main(String[] args) {
        ListNode head  = new ListNode(1,null);
        ListNode node = removeNthFromEnd(head, 1);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

    }
}
