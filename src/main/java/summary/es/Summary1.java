package summary.es;

public class Summary1 {
    /**
     *
     * es优化
     * 查询优化
     * 不要用wildcard（这个根分词已经没关系了）
     * 查top数据很快
     * 少用*做通配符
     *
     * es的坑
     * es分页查询 越到后面越慢
     * 解决：不允许深度分页
     * scroll滚动查询 每次查询通过游标移动  但是只能一页一页的往后翻 不能随意跳
     *
     *
     *  es分页
     * from size 类似mysql里的limit 默认是10000 from+size超过10000就会报错
     * 滚动查询 scroll查询  基于快照的形式 会返回一个scroll_id 这个是游标的位置 类似初始位置
     * 
     *
     *
     *
     * 索引
     * 数据文档
     *
     * 分片
     * 索引数据分段
     *
     *
     * es为什么那么快
     * 倒排索引
     * FST数据结构
     * 前缀树
     *
     *
     *
     * es模糊查询：使用wildcard很慢
     * 可以用completion suggester（前缀匹配）、term/phrase、
     * 换一个分词器nGram tokenizer 然后term 查
     *
     *
     *
     *
     *
     */

 }