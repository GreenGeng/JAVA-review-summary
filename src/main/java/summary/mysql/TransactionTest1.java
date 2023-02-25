package summary.mysql;

public class TransactionTest1 {
    /**
     * 事务隔离级别怎么解决事务的问题
     * 事务隔离级别
     * 读未提交：可以读事务没提交的数据
     * 读已提交：解决了脏读，只能读事务已经提交的数据
     * 可重复读：解决了脏读和不可重复读，是数据库默认的隔离级别，保证了 多次读取数据结果一致
     * 序列化读：最高隔离级别，事务按照顺序执行
     *
     * 幻读到底是一个事务还是两个事务
     *
     * 加锁：
     * 脏读、不可重复读：读时加共享锁，读完释放锁，写时加排他锁，写完释放
     * 幻读：加范围锁（间隙锁）
     *
     * 怎么解决不可重复读
     * 修改隔离级别为可重复读
     *
     * 怎么解决幻读
     * MVCC加间隙锁的方式
     * 在快照读的情况下 mysql通过mvcc来避免幻读
     * （快照读：只读不修改 就不加锁）
     * 在当前读的情况下 mysql通过间隙锁来避免幻读 锁住某条件下的数据不能改
     * （当前读：在修改之前读  就要给读加锁 for update 或者 lock in share mode）
     * for update 是排他锁
     * lock in share mode是共享锁
     * 共享锁和排他锁都是悲观锁 就是加锁过程中 其他事务都不能参与修改 读也不行 除非事务提交
     *
     *
     * next-key lock:间隙锁
     * 间隙锁就是给某个范围加锁 就是在范围查询的时候加上排他锁或者共享锁
     *
     *
     * 实现可重复读
     *  使用MVCC
     *  读的是事务开始前的数据快照
     *
     *
     * 最左前缀优先
     * 假如两个字段 age 和 sex
     * where age =  1 and sex = 1 和 where sex=1 和 age=1
     * 同样 三个字段也是 只要存在最左边的字段就行 不管位置在哪都能命中
     * 这两个都是命中了索引 因为sql执行过程中有一个查询优化器会判断哪个索引优先
     * 只要是存在最左边就行 不管最左边位置在哪 如果不存在就不命中
     * > < 也会命中索引只要有该字段就行
     *
     */
}
