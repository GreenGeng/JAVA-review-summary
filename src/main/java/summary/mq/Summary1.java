package summary.mq;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

public class Summary1 {
    /**
     *
     * 生产者要shutdown
     * 里面的tag表示过滤

     * 启动顺序：先启动nameserver，再启动broker
     * 在实现类上面加@Service
     *
     * 消息队列的使用
     * 如果请求大的话 把请求存队列里 属于削峰的作用
     * 或者把请求的失败结果放队列里 然后消费者去获取失败请求可以用作回退的作用（使用try-catch try里
     * 如果有异常就是请求失败 就会到catch里发送消息到队列里）
     *
     * 项目中遇到的问题点
     * 回退库存的时候要注意
     * 从消息队列里拿到消息 对消息做解析 判断一下之前有没有处理过 （有一个消费日志 在该日志里查询有没有该订单处理的记录）
     * 然后看日志里的处理状态
     * 如果状态是处理成功或者处理中 就不要再处理了 保证消息的幂等性
     * 如果没处理或者处理失败的话
     * 没处理：就把状态改成处理中 然后进行回退 然后把状态改成成功
     * 处理失败：要判断处理的消息的次数，如果>3 , 就不再处理
     * 反之用数据库乐观锁把处理状态改成处理中（乐观锁是因为并发环境下 为了数据安全）然后进行回退 把状态改成成功
     * 回退库存的幂等性
     *                        消费记录
     *                           ｜
     *           （有记录）        ｜                  （没记录）
     *           处理过---------------------------------未处理
     *             ｜                                    ｜
     *             ｜                                    ｜
     *             ｜                                    ｜
     *   ---------------                                 ｜
     *   ｜     ｜      ｜                                ｜
     *   处理   处理    处理                               ｜
     *   成功   中      失败                               ｜
     *  ｜     ｜        ｜                              更改消息
     *  ｜     ｜        ｜                                状态为
     *  ｜     ｜        ｜                               处理中
     *  ｜     ｜       判断消息                            ｜
     *  ｜     ｜       处理次数-------- 如果<3              ｜
     *  ｜     ｜           ｜           ｜                ｜
     *  ｜     ｜           ｜           ｜                ｜
     *  ｜     ｜           ｜           数据库乐观锁        ｜
     *  ｜     ｜           ｜           更改消息状态        ｜
     *  ｜     ｜           如果          为处理中           ｜
     *  ｜     ｜           >3            ｜               ｜
     *  ｜     ｜           ｜            ｜               ｜
     *  ｜     ｜           ｜            ｜               ｜
     *  ｜     ｜           ｜            ｜               ｜
     *  ｜     ｜           ｜            ｜---回退库存------｜
     *  ｜     ｜           ｜                     ｜
     *  ｜     ｜           ｜                     ｜
     *  ｜     ｜           ｜                     ｜
     *  ｜     ｜           ｜                     ｜
     *  ｜     ｜           ｜                   更改消息
     *  ｜     ｜           ｜                    状态为
     *  ｜     ｜           ｜                    成功
     *  ｜     ｜           ｜                     ｜
     *  ｜     ｜           ｜                     ｜
     *  ｜ -----------------｜------------------- 结束
     *
     *
     *
     * 数据库乐观锁怎么写 ？（set version = version+1 where version = oldVersion）
     * 先修改版本号+1
     * 用mybatis反向工程里的Example.Criteria去查询旧版的数据
     * 然后使用updatedByExampleSelective（这个方法就是更新字段）修改为新值
     * 要不然就是根据之前版本号查询 更新的时候给版本号加一
     *
     *
     *
     * 雪花算法
     *
     * 以后写一个项目时候
     * 先分析好每一步要做什么
     * 然后把这个粘贴代码里注释
     * 然后按步骤实现
     * 这样脑子就不会混了
     *
     * 如果请求堆积的话 可以用线程池来处理请求 线程池优化 就是把逻辑放到线程池的submit里就行
     * new ThreadPoolExecutor(...).submit(new Runnable() {
     *             @Override
     *             public void run() {
     *                 send(topic,tag,key,content);
     *             }
     *         });
     *
     *
     *
     *  如果支付的量也多 就把支付的结果也保存到消息队列里
     *  然后对应的服务去获取消息 把支付状态改成已支付
     *
     *
     *  其实消息队列就是把消息封装好 发送到某个topic(类似数据库的库)里 然后取个名字叫tag（类似数据库的表）
     *  内容是content（类似数据库内容） key为唯一值（类似数据库表里的主键）
     *  消费者就是对应的service监听获得数据就行 监听的话就是implements  RocketMQListener<Message>接口
     *  内容就是msg.getBody()
     *
     *
     */

//    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    // prodcer发送消息
    public void send(String topic,String tag,String key,String content) throws MQBrokerException, RemotingException, InterruptedException, MQClientException {
        //key是业务key
        Message message  = new Message(topic,tag,key,content.getBytes());
        rocketMQTemplate.getProducer().send(message);
    }





}
