package code.listnode;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
    //回文链表
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur=  head;
        while (cur!=null){
            list.add(cur.val);
            cur = cur.next;
        }
        //双指针判断list是不是回文
        int len = list.size();
        for(int i=0,j=len-1; i<len/2 && j>len/2;i++,j--){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

    }
}
