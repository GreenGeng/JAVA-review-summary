package test1.listnode;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    /**
     * 指定区域内反转链表 写的不对 得重写
     *
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(
                1,new ListNode(2,
                new ListNode(3,
                        new ListNode(4,
                                new ListNode(5,null))))
        );

        ListNode node = reverseBetween(head, 2, 4);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

    }

    public static ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here

        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        // list区间反转


        ListNode node = new ListNode(-1);
        ListNode pre = node;
        for(int i=0;i<list.size()-1;i++){
            node.val = list.get(i);
            node.next = new ListNode(list.get(i+1));
            node = node.next;
        }

        return pre;

    }

    public static void swap(int i,int j){
        int t = i;
        i=j;
        j=t;
    }

}
