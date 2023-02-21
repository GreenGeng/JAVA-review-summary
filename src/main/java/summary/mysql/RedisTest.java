package summary.mysql;

public class RedisTest {
    /**
     *
     * aof重写的过程
     * redis主进程通过fork创建子进程
     * 子进程根据redis内存中的数据创建数据库重建命令放在临时文件中
     * 父进程继续响应客户端请求把写请求追加到AOF文件中 这些请求会被放置到一个缓冲队列中
     * 子进程重写完成后通知父进程，父进程把队列里的命令写到临时文件里
     * 父进程用临时文件来替代老的aof文件
     *
     *
     *
     *
     *
     * @param args
     */

}
