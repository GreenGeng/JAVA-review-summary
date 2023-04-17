package summary.jvm;

public class Summary4 {
    /**
     * 什么时候会STW
     * 只要GC 就会STW 只是时间长短不一样 跟收集器有关
     *
     * 什么时候会出发 full GC
     * system.gc()会触发
     * 老年不足的时候也会
     *
     */
    //一个是每门课大于80的姓名
    // 一个抢红包算法
    //线程交替打印1-100 分奇偶

    /**
    valueof里面调用的还是tostring 直接toString是没有判空的 valueOf是给toString做了一次判空
    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }


     OOM的原因
     加载的文件或图片过大
     线程数量过多（阻塞队列设置太大）
     解决：
     即使回收资源
     使用统一的线程池管理



     程序计数器；存放当前线程运行的字节码位置
     栈：存放方法信息和对象引用
     本地方法栈：存放native方法的信息
     堆：数组或对象
     方法区：常量或静态变量信息、类信息


    **/

}
