package code.listnode;

public class Test6 {
    /**
     * 两个链表相加
     * @param args
     */
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2,new ListNode(4,new ListNode(3,null)));
        ListNode l2 = new ListNode(5,new ListNode(6,null));
        ListNode node = addTwoNumbers(l1, l2);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1!=null || l2!=null){
            int x = l1==null?0:l1.val;
            int y = l2==null?0:l2.val;
            int sum = x+y+carry;

            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }
        if(1==carry){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

}
