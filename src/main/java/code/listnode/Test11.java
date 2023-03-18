package code.listnode;

public class Test11 {
    public static ListNode getKthFromEnd(ListNode head, int k) {
        int len =0;
        if(head == null) return head;
        ListNode cur = head;
        ListNode pre = head;
        while (cur!=null){
            len++;
            cur = cur.next;
        }
        for(int i=0;i<len-k;i++){
            pre = pre.next;
        }

        return pre;


    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));

        head = getKthFromEnd(head,2);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }
}
