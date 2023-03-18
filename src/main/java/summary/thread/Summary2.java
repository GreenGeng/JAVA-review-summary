package summary.thread;

public class Summary2 {
    /**
     *  为什么设计CPU缓存
     *  解决CPU运算速度与内存读写速度不匹配的问题，CPU就要花时间等内存传输数据
     *  CPU缓存存储主存中经常使用的数据和指令
     *   L1最快 越靠近CPU 速度越快 容量越小
     *   容量小提高命中率
     *
     *  volatile怎么保证禁止重排序
     * 使用volatile关键字的时候 会出现lock前缀的指令
     * 这个指令相当于一个内存屏障
     * 作用是不会把后面的指令排在内存屏障之前
     * 不会把前面的指令排在内存屏障之后
     * https://www.codenong.com/cs106038681/
     *
     *
     *  cpu和内存之间是不能直接交互数据的 是通过总线交互的
     *  主存存共享 线程之间有自己的工作内存
     *
     *
     *
     *  为什么要禁止重排序
     *  禁止CPU执行指令的时候重排
     *  避免在多线程环境下程序出现错乱执行的现象
     *
     *
     *  volatile怎么保证可见性
     *  在该变量进行写操作时候会多一个 lock指令，将当前行数据写到主存里
     *  根据缓存一致性，其他线程内存中存储的该变量的值就会失效
     *  然后重新从主存里获取最新的值
     *
     *
     *
     *
     *  synchronize怎么保证原子性
     *  保证同一个时间内只有一个线程能拿到锁
     *  monitorenter和monitorexit指令
     *  遇到moniterenter指令的时候 如果线程获取到锁 锁的计数器就会+1
     *  其他线程就一直循环等待
     *  遇到monitorenter指令的时候 锁的计数器-1
     *  如果锁的计数器为0 就会释放锁
     *  所以之后有一个线程能获取到锁 因为只有获取到锁+1 没有获取到就等待
     *  （类似setnx里的给key赋值）
     *
     *
     *
     *
     *  synchronized 怎么可见性
     *   monitorenter指令后面有一个load屏障 执行refresh操作 会把新值刷新到主存里
     *   monitorexit指令后面有一个store屏障 让线程把修改到变量执行flush操作 刷到主存里
     *   monitorenter----load屏障 --refresh
     *   monitorenter----store屏障---flush
     *
     *
     *  synchronzied怎么有序性
     *  monitorenter指令和load屏障之后会加一个acquire屏障
     *  这个屏障是禁止读写操作重排
     *  monitorexit指令前加一个release屏障也是禁止读写重排
     *  monitorenter--load屏障--acquire屏障
     *  release屏障--monitorexit指令
     *
     *
     * ThreadLocal使用场景
     * 保存线程不安全的工具类
     *
     *
     *
     *
     *
     */
}
