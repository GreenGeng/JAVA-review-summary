package summary.designMode.singleton;


public class Test2 {
    /**
     * 什么时候使用单例
     * 单例就是创建一个对象然后全局访问，一般是创建数据库连接对象JdbcTemplate或者redisTemplate等
     *
     */

    private volatile Singleton singleton;

    public Singleton singleton() {
        if (singleton == null) {
            /**
             * 这里是类锁 不是对象锁 对象锁是实例锁 实例与实例之间互不影响
             * 类锁是所有对象都用一把锁
             * 对象锁和类锁不排斥
             * 因为这里只能出创建一个对象 需要互斥 所以使用类锁
             */
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton =  new Singleton();
                }
            }
        }
        return singleton;
    }



}
