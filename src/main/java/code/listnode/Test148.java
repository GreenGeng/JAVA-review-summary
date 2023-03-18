package code.listnode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test148 {
    public static ListNode sortList(ListNode head) {
        if(head==null) return head;
        ListNode cur = head;

        List<Integer> list = new ArrayList<>();
        while (cur!=null){
            list.add(cur.val);
            cur = cur.next;
        }
        Collections.sort(list);
        ListNode node = new ListNode();
        ListNode pre = node;
        for(int n:list){
            ListNode nextNode = new ListNode();
            nextNode.val = n;
            node.next = nextNode;
            node = nextNode;//这句是重点
        }

        return  pre.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4,new ListNode(2,new ListNode(1,new ListNode(3,null))));
        ListNode node = sortList(head);
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
