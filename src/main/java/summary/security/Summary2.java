package summary.security;

public class Summary2 {
    /**
     * SQL 注入
     * 一般笼统的称为数字型和字符串型
     * 详细可分为：联合查询、报错注入、时间盲注、布尔盲注等
     * 满足SQL注入的条件：
     * 1 输入可控
     * 2 直接或间接拼接SQL
     *
     * SQL审计：
     * 根据select 或者update等SQL关键字或者是通过执行SQL语句定位到SQL片段
     * 查看SQL语句中是否存在变量引用并跟踪变量是否可控
     * 只有当传进来的参数是String 才可能进行SQL注入
     *
     * Preparestatement里的？占位符是通过SetXXX的方式赋值的
     * SQL语句编译的时候 执行计划会被缓存起来 使用预编译语句比普通语句更快
     *
     * 使用的时候都需要注意
     * like 使用concat拼接
     * in 使用foreach
     * order by 后面的字符如果加了引号就不会被识别为字段 而是普通字符串了 这样order by就会失效
     *
     *
     * #{}底层就是使用？作为占位符来生成preparestatement
     *
     * 常见关键字
     * Statement、createStatement、PrepareStatement、like $、in($、等
     *
     * 二次注入
     *
     * 防护
     * 预编译
     * orderby需要手动过滤
     * 因为SQL注入基本上都是因为String类型的参数导致的
     * 可以类型转换 为Int类型等也可避免注入
     *
     *
     *
     *
     */
}
