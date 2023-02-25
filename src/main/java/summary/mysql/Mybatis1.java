package summary.mysql;

public class Mybatis1 {
    /**
     * mybatis分页
     * 1、使用PageHelper第三方插件
     * PageHelper.offsetPage(1, 10);
     * 2、RowBounds实现分页
     * 这是逻辑分页 主要是两个字段 offset 和 limit
     * 3、limit关键字
     * limit no,size
     *
     *
     * 实现原理
     * 通过读取全局配置文件和mapper映射文件，构造了SQLsessionFactory工厂，创建了SQLsession会话
     * 通过底层的Executor来执行数据库（缓存也是走Executor执行器）
     *
     *
     *
     */
}
