package summary.mysql;

public class Summary1
{
    /**
     *
     * mysql怎么加行锁
     * 表中创建索引，select where 后面必须是索引，不然行锁无效
     * 必须要有事务
     * 在select语句后面加for update
     * select * from 表 lock in share node 读锁
     *
     *
     * 慢sql怎么优化
     * 先看type是不是all 在看key 如果是null就没有用到索引
     * 然后在看rows 数值越大 扫描的行数就越多
     * 然后在看Extra（额外信息 如排序等） 避免出现Using filesort或Using temporary这样的字眼
     *
     * mysql调优
     * 用explain看有没有命中索引（type列+key列）
     * 然后看语法
     *
     * char和varchar
     * char不可变、varchar可变
     * 比如说都是10个长度 char存储进去 后面多余的都是空格 取出来要用trim去掉空格
     * varchar存进去 会自动去掉多余空格 长度是存的字符串的长度就不是10
     *一般char存储固定长度的数据（性别）
     *
     *
     * mysql 死锁
     * 锁：页锁、表锁、行锁、
     * 表锁：加锁快、粒度大，不会出现死锁
     * 页锁：会死锁
     * 行锁：加锁慢、会死锁、粒度最小
     * 死锁：因争夺资源而相互等待
     *
     *
     * 聚簇与非聚簇
     * 都是b+树的结构
     * 聚簇：叶子节点存放的是具体数据
     * 非：叶子节点不存放数据，而是索引的信息 需要再根据索引查询数据（回表）
     * 主键一定是聚簇索引
     * 聚簇
     * 优点：查询快，适合范围查询
     *
     *
     *
     * 回表（非聚簇）
     * mysql查了两次 一次查到索引 第二次根据索引查数据
     * 看explain里如果使用了索引 并且extra里是using where 就是回表
     *
     *
     * 试一下最左前缀
     *
     *
     *
     *
     *
     *
     *
     * 
     */
}
