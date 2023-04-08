package summary.other;

public class Summary1 {
    /**
     * 性能优化
     * 数据库
     * 是否join、or、in 太多
     * 索引优化 是否命中索引 能否避免回表 尽量索引覆盖 索引字段是不是太多
     * 减少多表关联
     * 代码优化
     * 多次查询改成批量查询，减少数据库访问次数，减少远程接口调用
     * 使用缓存
     * 消息队列异步解耦
     * 合理加锁
     * if-else里把可能命中的结果放前面 减少后续的逻辑
     * if-else多了可以使用策略模式（好处：方便代码的后期维护）
     *
     *
     */
}