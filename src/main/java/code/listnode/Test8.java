package code.listnode;

public class Test8 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1!=null || l2!=null){
            int x  = l1==null?0:l1.val;
            int y = l2==null?0:l2.val;
            int sum = x+y+carry;

            //用来判断是不是加一的
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            cur = cur.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry==1){
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9,new ListNode(9,new ListNode(9,null)));
        ListNode l2 = new ListNode(2,new ListNode(2,null));

        ListNode node = addTwoNumbers(l1, l2);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

    }
}
