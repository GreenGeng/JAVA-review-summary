package code.listnode;

import java.util.HashSet;
import java.util.Set;

public class Test83 {
    //删除链表中的重复元素
    public static void main(String[] args) {
        ListNode node = new ListNode(1,new ListNode(1,new ListNode(2,null)));
        node = deleteDuplicates(node);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }

    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node.next != null && node.next.next != null){
            int val = node.val;
            int nextVal = node.next.val;
            if(val == nextVal){
                node.next= node.next.next;
            }
        }
        return head;
    }
}
