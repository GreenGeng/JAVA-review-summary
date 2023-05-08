package summary.mysql;

public class Summary1
{
    /**
     * mysql如果报错说连接不上 可能是没开启
     * sudo mysql.server start 开启服务
     * 或者使用brew来启动brew services restart mysql
     * 开启redis 服务 redis-server
     *
     *
     * eq_ref:唯一索引---
     * ref:非唯一索引
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
     * 回表（非聚簇）
     * mysql查了两次 一次查到索引 第二次根据索引查数据
     * 看explain里如果使用了索引 并且extra里是using where 就是回表
     *
     *
     * mysql优化
     * 少用select *
     * 加索引 但是注意like使用要命中索引 选择合适的列 区分度高的列
     * 减少子查询 因为要创建临时表 查询完又得删除  速度会影响 用union代替
     * 少用join join也是嵌套查询 数据量大的话性能就会低
     * or后面的索引不会命中 用in代替or（也可以用union代替or）
     * in可以用exists代替
     * 避免在where使用 ! < >
     *
     *
     *
     * union和union all的区别
     * union会唯一性过滤 涉及到排序 存在大量CPU计算 消耗资源
     * 如果确定没有重复数据 最好使用union all
     *
     *
     * mysql 关键字执行的顺序
     *  from on join groupby orderby limit
     *
     *
     * mysql的分布式锁
     * 1 唯一索引
     * 利用索引的唯一性这个互斥条件 unique key
     * 加一个唯一性的字段（要抢的资源） 如果A线程获取到锁 就加一行记录 B线程访问的时候
     * 发现有记录 就等一段时间然后重试 A结束之后把记录删了
     * holder字段就是当前获取锁的线程ID
     * 不过会存在问题：万一A挂了 记录一直没删 其他线程就一直不能获取到数据的锁
     * 解决方法
     * 可以构建一个服务不停的扫描 删除一些时间比较久的记录
     * 但是这样做不安全  万一别的锁还在执行就会出现问题
     *
     * 2 使用唯一键+时间戳
     * 就是在上面的基础上加一个时间戳的字段
     * 时间戳< 当前时间-ttl 就说明A线程已经获取锁很长时间了 B就可以获取锁了
     * ttl就是线程存活时间
     *
     * 3 使用for update
     * 加悲观锁 读取的时候加悲观锁 别的线程就没办法读
     *
     *
     * count(*)返回的是所有
     * count（列）会过滤null
     * count(*)和count(1)没什么区别 最好使用count(*)因为这个是规范
     * 性能： count(主键) > count(*) = count(1)
     *
     *
     * delete drop truncate的区别
     * delete只删数据不删表结构 可以回滚 delete有where可以删除部分数据
     * truncate和drop不走事务 删了就找不回数据
     * drop可以删表
     * truncate删除所有数据 也可以删表结构
     *
     *
     * A left join  B 返回A的全部
     * A right join B 返回B的全部
     *
     *
     * mysql关键字执行顺序
     * from on join where group by having select distinct union order by limit
     *
     *
     * in和exists的区别
     * 都是先查内部表然后跟外部表做笛卡尔积
     * in适合内部表数据少
     * exists适合内部表数据大
     * not in 有时候不会走索引 所以not exists比not in 效率好
     *
     *
     * mysql查询最后一条记录
     * 如果是自增就 select * from table order by id desc limit 1
     * 不是自增就是 select * from table where id = max(id)
     */
}
