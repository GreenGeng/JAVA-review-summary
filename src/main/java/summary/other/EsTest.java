package summary.other;

public class EsTest {
    /**
     * 为什么es倒排索引那么快
     * 什么时候使用es
     * 什么时候使用es 什么时候使用mongo
     *
     * 倒排索引
     * 内容分词，提取关键字，根据关键字建立倒排索引，用户输入关键字
     *
     * 分词就是term
     * 为了快速查term 给term加了个目录 将term排序 用二分法 类似B+树
     *
     * term 目录保存涉及到term index  ，这是一个字典树
     */
}
