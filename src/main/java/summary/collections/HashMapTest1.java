package summary.collections;

public class HashMapTest1 {
    /**
     * 安全的hashmap有哪些
     * concurrntHashmap、synchronizedMap、Hashtable
     *
     *
     *
     *  //vector和map的区别
     *  // vector扩容的原理
     *
     *
     *  // 1.7头插法
     *  1.7扩容的时候是重hash 因为数组长度变了
       过程 插入的时候 先判断数组长度够不够 如果不够 就扩容 把之前的值迁移过去
       因为长度变了 所以rehash 如果hash碰撞  使用头插法 在多线程环境下
       头插+扩容rehash(rehash之后元素所在位置就不是原位了)会导致链表循环
       如果够的话 就直接头插 并且要新节点覆盖原节点位置 整体下移

        1.7和1.8都是两倍扩容 只是后期数据迁移方式不同
        1.7需要rehash (数组长度变了)
        1.8 要么是原位 要么是原位加旧数组长度（就是隔了一个就的长度）
        1.8尾插+不需要rehash就避免了链表循环

     * 1.8的hashmap不安全
     * 两个线程进行put操作 并且计算出的插入下标一致 假如A计算好了hash还没插入 时间片截止
     * B完成插入 时间片到A A直接插入 就把B覆盖了
     *
     *
     * 为什么hashtable安全
     * 因为在put和remove方法上加了synchronized锁
     *
     *
     * @param args
     */
    public static void main(String[] args) {

    }
}
