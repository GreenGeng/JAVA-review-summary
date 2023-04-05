package summary.collections;

public class HashMapTest1 {
    /**
     * 安全的hashmap有哪些
     * concurrntHashmap、synchronizedMap、Hashtable
     *
     * hashtable是在增删改查的方法上都增加了synchronized锁
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
        1.7需要rehash (数组长度变了 因为之前的hash是跟新数组长度有关的)
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
     * CAS在concurrenthashmap的具体体现
     * 1.7的是使用segments 对每个segment加了锁
     * 1.8中使用CAS机制来更新数据
     * 初始化数组的时候就使用了CAS 保证线程安全 （原子性）
     * put插入的时候 也使用了CAS 如果当前hash里没有元素再插入
     *
     *
     * 为什么hashmap用红黑树不用别的树
     * 因为二叉查询树会成链表
     * b树、b+树适合磁盘数据查询
     * AVL树是高度平衡的 因为他支持完全平衡 查询会比红黑树快 但是插入的话比红黑树效率低 因为旋转次数多
     *
     *
     * rehash
     * 就是把原来的值放到新桶里
     *
     *
     * 1.7的头插法
     * 插到头节点之后 整体要往下移
     * 源码
     *  //转移原哈希表中的元素到新的哈希表中
     *     void transfer(Entry[] newTable, boolean rehash) {
     *         //获取新数组容量
     *         int newCapacity = newTable.length;
     *         //遍历老哈希表Entry[]数组
     *         for (Entry<K,V> e : table) {
     *             //当这个Entry不为空
     *             while(null != e) {
     *                 //将e的下一个节点赋值给next
     *                 Entry<K,V> next = e.next;
     *                 //一般不需要重新计算哈希值
     *                 if (rehash) {
     *                     e.hash = null == e.key ? 0 : hash(e.key);
     *                 }
     *                 //重新计算需要在新数组插入的数组下标
     *                 int i = indexFor(e.hash, newCapacity);
     *                 //将e元素插入到newTable[i]的头上，即将e的next属性指向newTable[i]
     *                 e.next = newTable[i];
     *                 //将e元素插入到newTable[i]上（头插法）
     *                 newTable[i] = e;
     *                 //开始转移下一个元素
     *                 e = next;
     *             }
     *         }
     *     }
     *
     *
     *
     * hashet底层是hashmap
     * hashset可以为null
     * hashmap的key-val都可以为空 但是key只能有一个null
     * hashtable的key-val都不能为空
     *
     */
}
