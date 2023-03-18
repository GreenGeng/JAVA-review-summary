package summary.mysql;

public class Mybatis1 {
    /**
     *
     *
     *
     *
     * mybatis分页
     * 1、使用PageHelper第三方插件 执行了拦截器动态拼接sql的limit语句 (物理分页)
     * PageHelper.offsetPage(1, 10);
     * 2、RowBounds实现分页
     * 这是逻辑分页 将所有内容查出来 然后在物理内存进行截取 数据量大不可用
     * 3、sql语句（物理分页）limit关键字
     * limit no,size
     *
     *
     * 实现原理
     * 通过读取全局配置文件和mapper映射文件，构造了SQLsessionFactory工厂，创建了SQLsession会话
     * 通过底层的Executor来执行数据库（缓存也是走Executor执行器）
     *
     *
     * 缓存（先二级 再一级 因为二级的范围比一级大）
     * mybatis缓存设计：装饰器模式
     * 一级缓存：sqlseesino级别
     * 二级缓存：sqlsessionFactory对象缓存 是mapper映射级别的缓存 多个sqlsession共享     *
     *
     *
     * mybatis执行流程
     * 先读取全局配置文件
     * 读取里面mapper.xml
     * 创建会话工厂
     * 场景SQLsession会话
     * 使用executor执行器执行数据库
     * 根据sqlsession会话传递的参数动态构建sql语句
     * 用执行器执行
     *
     *
     */

}
