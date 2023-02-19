package test2.mysql;

public class Test1
{
    /**
     *
     * mysql 怎么加行锁
     * 表中创建索引，select where 后面必须是索引，不然行锁无效
     * 必须要有事务
     * 在select语句后面加for update
     * select * from 表 lock in share node 读锁
     *
     *
     * 实现可重复读
     * 使用MVCC
     * 可重复读隔离级别下，事务在启动之前读的是整个库的快照
     * 
     */
}
