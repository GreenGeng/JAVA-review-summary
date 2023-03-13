package code.listnode;

public class Summary {
    /**
     * 如果创建一个链表节点不想有值 就直接为null
     * ListNode node = null
     *
     *
     * 创建一个新的链表
     *   ListNode node = new ListNode();
     *         for(int n:list){
     *         //新建一个节点
     *             ListNode nextNode = new ListNode();
     *             nextNode.val = n;
     *             node.next = nextNode;
     *             node = nextNode;//这句是重点 如果不把node往后移动 中间的会被覆盖
     *         }
     */
}
