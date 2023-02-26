package summary.redis;

public class Summary1 {
    /**
     * rdb和aof怎么配合使用
     * 使用rdb恢复内存状态会丢失大量数据
     * 使用AOF重放性能比较低
     * 开启混合持久化 在AOF重写时 把重写前的内存做RDB快照，并且将快照和增量的AOF修改内存数据的命令存在一起，都写入AOF中，
     * 等重写完新的AOF文件覆盖原来文件
     *（先加载RDB内容，然后再重放增量AOF日志完全替代之前的AOF文件）
     *
     * redis数据备份策略
     * 写crontab定时调度脚本，每小时copy一份到rdb或者aof的备份到一个目录中 ，仅保留最近两天备份
     * 每天保留一份当日的数据备份到一个目录中，可以保留最近一个月的备份
     * 每次copy备份的时候 把太旧的备份删除
     * 每天晚上将当前的备份复制到一份到其他机器上
     *
     *
     *
     * redis常用指令
     * keys 查询所有key
     * string：set、get、append、incr key(key的value+1)、decr key、mset（批量插入）、mget、msetnx(批量插入key不存在的数据)
     * list: lpush (一个或多个）、lrange（获取指定区间的值）、lpop、rpush、rpop、lrem、lindex
     * set: setadd(一个或多个)、smembers(获取指定key的所有元素)、srem、spop、
     * hash: hset(一个或多个)、hget、hgetall、hexists、hdel、hlen
     * zset: zdd、zrange、zrem、zrank（获取指定元素的排名）、zcount（获取指定区间里元素的个数）、zscore(获取指定元素的分数)
     *
     *
     * aof文件太大的话就重写
     * aof重写的过程
     * 创建一个子进程，redis执行完写命令将命令发送到AOF缓冲区和AOF重写缓冲区
     * 子进程完成后给父进程发送一个信号
     * 父进程把重写缓冲区里的命令加载到新AOF文件里
     *
     *
     *
     *
     *
     * 布隆过滤器
     *
     *
     * redis里的事务
     * redis事务里没有回滚，没有原子性，如果有一个命令失败，其他命令会继续
     * mysql是在commit提交之前 只要提交命令都会执行 redis是没有exec命令就不会执行 所以不存在脏读那些 也没有事务隔离级别
     * 如果事务出现问题可以放弃事务（discard）
     * 注意如果是语法错误 那事务里的其他语句都不会执行
     * 如果是逻辑错误 一条语句出现问题 其他不会影响
     *
     *
     * redis五种数据类型的数据结构
     * string：最大512m 可以存任何类型的数据 包括图片
     * SDS好处：获取字符串长度很快，二进制安全（他的API是安全的）、不会造成缓冲区溢出（因为有个字段是记录空闲大小的 如果不够会先扩容 避免溢出）
     * list
     * 数据量较少的时候是一块连续的内存 为压缩列表
     * 数据量较大的时候会变成快速链表
     * set（类似hashset）
     * 无序、唯一的集合
     * zset
     * 有序 、唯一的集合
     * 里面有一个score 代表权重
     * hash（类似hashmap）
     * 数组+链表的方式 他的value只能存字符串
     *
     *
     *
     *
     *
     */


}
