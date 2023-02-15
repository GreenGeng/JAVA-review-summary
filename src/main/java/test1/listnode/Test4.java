package test1.listnode;

public class Test4 {
    public static ListNode deleteDuplicates (ListNode head) {
        // write code here
//        删除链表里重复元素
        ListNode cur = new ListNode(-1);
        cur.next = head;

        while (cur!=null){
            if(cur.next!=null && cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1,
                new ListNode(1,new ListNode(1,null)));
        ListNode head = deleteDuplicates(node);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }

    }
}
