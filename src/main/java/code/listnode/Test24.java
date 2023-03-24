package code.listnode;

public class Test24 {
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode next  = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
        node = swapPairs(node);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
