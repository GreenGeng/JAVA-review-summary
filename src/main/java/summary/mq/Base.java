package summary.mq;

public class Base {

    /**
     * rocketmq
     * MQ 异步 解耦 削峰
     * 异步：非阻塞 提高效率
     * 解耦：减少服务之间的影响，提高系统的稳定性
     * 削峰：对抗流量冲击
     * MQ缺点：系统复杂性提高、消息一致性问题、系统稳定性降低
     * 消息丢失、重复调用、消息的顺序性
     *
     * kafka功能单一、会丢数据
     *
     * 生产者三种方式发送消息：
     * 同步、异步、单向
     * 同步是生产者给Broker发消息 等待Broker返回信息再继续发消息
     * 异步是 生产者先只管给Broker发消息，发完再挨个返回消息的状态
     * 单向是 生产者只管给Broker发消息 不管后续
     *
     * 消费者消费的两种方式
     * 主动去Broker节点拉取数据
     * 等待Broker发消息推过来
     * 主动拉要shutdown
     * 被动不要
     *
     *   类比数据库
     *   topic：库
     *   tag:表
     *   key:唯一键
     *
     *   Producer：发送者
     *   Comsumer:消费者
     *   Broker：暂存消息的地方
     *   NameServer: 管理Broker
     *   Topic: 区分消息的种类
     *
     *
     *
     *
     *
     */
}
