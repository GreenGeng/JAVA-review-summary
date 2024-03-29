package summary.mysql;

public class Index {
    /**
     *
     * 普通索引：主要任务就是提高查询速度，索引内容可以重复 可以为空
     * 唯一索引；索引内容唯一，可以为空
     *
     *
     *
     * 怎么创建索引
     * 创建表的时候创建：create table XX (  index (id));
     * 直接为表添加
     * alter table XX add index id
     * 直接创建索引
     * create index id  on 表
     *
     * b+树怎么保持平衡
     * 二叉查找树可能会变成链表结构
     * B树 ：多路平衡查找树
     * B+树比B树稳定因为所有叶子节点才是数据，查询的次数都一致
     * B+树只需要遍历叶子节点即可 不像B树需要对每一层遍历
     * 在b树的基础上 把所有叶子节点排序 并且数据都存放在叶节点上
     * b树是把节点的关键字按照递增的次序排列 按照左小右大的原则
     *
     *
     * B+树的叶子节点存的是主键key或者是具体数据
     * 如果存放的是主键Key 就是非聚簇索引 需要再根据key去查询数据（回表）
     * 如果存的是具体数据 就是聚簇索引
     *
     *
     * myisam的索引结构
     * 是b+的非聚簇索引结构（索引和数据的分开存放的）
     *
     * b+树的叶子节点存放在页里 一页大小16kb
     * 叶子节点之间是双向链表
     *
     * b+树只要遍历叶子节点就是遍历了整个树的数据
     *
     * 适合加索引
     * 数据量大 查询频繁
     * 针对经常where 、order by、group by的字段查索引
     * 区分度高的字段作为索引
     * 减少单列索引、联合索引可以避免回表
     * 控制索引数量
     *
     *
     //除了b树 b+树还有什么索引结构
     * 还有hash索引 就是把索引的值转成hash
     * 优点 单个值查找速度快 范围查询慢
     *
     * 索引覆盖
     * 查询的字段 正好都在索引里就是索引覆盖
     * 避免回表
     * 如果一个索引包含了所有需要查询的字段的值 不需要回表 就是覆盖索引
     * extra是using index就是覆盖索引
     *
     * 索引下推
     * 索引遍历时候 对包含的字段先判断 过滤掉不符合条件的记录 减少回表次数
     * （例如 select * from user where name like "张%" and age = 10）
     * 之前是先在辅助索引里查name 再去主键索引里过滤age
     * 下推是先在辅助索引里过滤age和name 后面再查主键索引
     *
     *
     * extra指标
     * using index 索引覆盖
     * using where 全表扫描(没有用到索引)
     * using temporary 使用了临时表（group by）
     *
     *
     * > 、!+、order by、(主键除外) 会不能命中索引
     *
     *
     *  创建索引的方式 括号里是要作为索引的列
     *  create index idx_city_name on  user(city,lastname);
     *  如果遇到 > < ！范围查询的时候 右边是不生效的 如果范围是最后一个字段 就是范围查询
     *
     *
     * B+树叶子节点保存了完整的索引和数据 非叶子节点只保存索引 比b树查询稳定（因为查到叶子节点才能查到数据 所以查询次数是一致的）
     * B+的时间复杂度都是logn
     *
     * 树高度低：减少磁盘IO
     *
     *
     * 行锁有哪些种类
     * 共享锁 排他锁 间隙锁 next-key lock、 自增锁
     *
     * 共享锁的话 其他事务可以读 但是修改会阻塞
     *
     * 索引文件大小
     *
     *
     * mysql里的索引
     * 主键索引、唯一索引、复合索引
     *
     *
     *  聚簇与非聚簇
     *  聚簇索引 索引即数据 主键索引就是聚簇索引
     *  普通索引又叫二级索引
     *
     *
     *
     *  索引主要分为两种
     *  聚簇索引 与 非聚簇索引
     *  根据物理存储的方式来分的
     *
     *  not in 可能会不走索引
     *  select * where a not in ()不会走索引
     *  select a where a not in()会走索引
     *  如果select * not in 也想走索引就加一个limit
     *  mysql在选择索引的时候会进行优化 如果他认为全表比走索引快就会全表
     *
     *
     *
     * mysql里的data文件夹就是索引文件夹
     *
     */
}
