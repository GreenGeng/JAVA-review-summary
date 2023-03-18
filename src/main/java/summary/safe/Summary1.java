package summary.safe;

public class Summary1 {
    /**
     * mybatis为了防止sql注入需要使用#代替$
     * 但是在like模糊查询的时候 #是不起作用的
     * 推荐使用like concat 因为concat里面可以使用#
     *
     * in 后面加#也会报错
     * in后面改成foreach 然后使用#
     *
     *  order by后面不是直接跟$
     *  而是用if去判断如果id不为空就oder by id
     *  或者一些必须要使用$就先把所有查询出来 然后在代码层面分组或者排序
     *
     *
     * 重点关注 like in order by
     *
     *  # 是通过prepareStatement的预编译的，会对自动传入的数据加一个单引号。
     *
     *
     *  Python2打开HttpServer
     *  python -m SimpleHTTPServer
     *
     *  python3打开HttpServer
     *  python -m http.server
     *
     *
     *
     *
     */
}
