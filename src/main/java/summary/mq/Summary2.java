package summary.mq;

public class Summary2 {
    /**
     * 启动nameserver ->启动broker-》创建topic-》发布者发送信息-》消费者消费信息
     * 消息队列幂等性（采用唯一标识）
     * 解决：
     * 方法1 建立一个已经消费消息的表，每次消费之前检查一下表里有没有消费记录，如果有记录就是已经消费了就直接返回
     * 方法2 基于redis（也是记录消息是否消费过）
     * 使用set 消费消息前去redis里查看一下有没有该消息的唯一标识 如果有就说明已经消费过消息里 就直接返回
     * 或者自定义一个唯一性key 先去redis里查看一下有没有该key 有就说明消费了 已经记录 就直接返回
     *
     * 死信队列
     * 用来存放没有成功消费的信息，通常用来做消息重试 默认重试16次、ttl过期的消息
     * 有效期也是三天
     * 用途：订单支付超时取消
     *
     *
     * 消费模式：集群、广播（默认是集群）
     * 集群：消息是被组里的消费者平摊
     * 广播：一个消息被多个consumer消费
     *
     * 怎么保证消息不丢失
     * 生产者这边
     * 开启事务、采用同步发消息方式 等待broker返回信息、发送失败后重试
     *
     *
     *
     * 怎么保证顺序消费
     * 消息有序、生产者有序发送、消费者有序消费
     * 顺序消息分为全局顺序和部分顺序
     * 全局顺序就只使用一个队列和一个生产者 会严重影响性能
     * 部分顺序就要保证生产者有序存储、消费者有序消费
     * 只要将有序的一组消息存到同一个MessageQueue里，就能保证消息的有序
     *
     *
     *
     * 消费消息：推、拉（基本上都是拉）
     *
     *
     * 消息堆积
     * 原因：生产者太快、消费者太慢、broker阻塞
     * 解决：消费者扩容、多建几个topic 把堆积的消息转移到新topic上 多加几个消费者消费
     *
     *
     *
     * 消息过期怎么办
     * 默认48小时删除一次、指定删除时间
     *
     *
     * broker持久化
     *
     *
     *
     * topic和group
     * group表示一类producer和consumer 这类通常生产或者消费同一类消息
     * 同一个Group下的所有消费者必须保证topic一致
     *
     *
     * 消息队列会出现的问题
     * 消极积压  丢失 顺序问题 消费不了的问题
     *
     *
     *
     */
}
