package code.listnode;

public class Test10 {
    // 删除某个节点
    public static ListNode deleteNode(ListNode head, int val) {
        if(head==null) return null;
        if(head.next.val == val) return head.next;
        ListNode cur = head;
        while (cur.next!=null && cur.next.val != val){
            cur = cur.next;
        }
        if(cur.next != null){
            cur.next = cur.next.next;
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,null)));
        head = deleteNode(head,3);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }
}
