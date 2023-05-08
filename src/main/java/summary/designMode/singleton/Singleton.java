package summary.designMode.singleton;

//双重检查锁
class Singleton{
    /**
     * 这里会有一个volatile 为什么这里要加volatile
     * 这里加volatile是为了防止指令重排，应该按部就班的创建对象
     * 为什么两次判空呢
     * 防止多线程环境下重复创建对象
     *
     *
     */
    public volatile static Singleton singleton;
    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                /**
                 * 这里是类锁 不是对象锁 对象锁是实例锁 实例与实例之间互不影响
                 * 类锁是所有对象都用一把锁
                 * 对象锁和类锁不排斥
                 * 因为这里只能出创建一个对象 需要互斥 所以使用类锁
                 */
                /**
                 * 假如有两个线程
                 * A拿到时间片 创建了一个对象
                 * B在等待
                 * 如果没有第二次判断
                 * A结束后 B拿到时间片也创建对象了
                 * 就重复创建对象了
                 */
                if(singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
