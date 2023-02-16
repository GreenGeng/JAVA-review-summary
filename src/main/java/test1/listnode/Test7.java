package test1.listnode;

public class Test7 {
    /**
     * 反转链表
     */
    public static ListNode ReverseList(ListNode head) {
        ListNode node  = null;

        while (head!=null){
            ListNode cur = head.next;
            head.next = node;
            node = head;
            head = cur;
        }

        return node;


    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,null)));
        ListNode node = ReverseList(head);
        while (node !=null){
            System.out.println(node.val);
            node = node.next;
        }

    }
}
