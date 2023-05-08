package summary.designMode.singleton;


public class Test2 {
    /**
     * 什么时候使用单例
     * 单例就是创建一个对象然后全局访问，一般是创建数据库连接对象JdbcTemplate或者redisTemplate等
     *
     */

    volatile Singleton singleton;
    public Singleton singleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

}
