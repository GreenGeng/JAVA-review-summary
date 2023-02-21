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
     *
     *
     */
}