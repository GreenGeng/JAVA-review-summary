package summary.net;

public class Summary2 {
    /**
     * 单点登陆
     * 方法1 用户登入一个模块后 把session存储到服务器 然后把该session往别的模块到服务器都复制一份 登陆时候就不用重新登陆
     * 方法2
     * 使用cookie+redis
     * 用户登陆一个模块的时候，把用户ID作为key存储到redis里 value为用户信息，key要保证唯一性，然后把key加到cookie里
     * 用户用该cookie去访问别的模块，服务端先根据cookie里到key去redis查找看有没有该用户信息
     * 方法3
     * 使用token（规则生成的字符串）
     * 用户访问一个模块的时候，服务器端会给他返回一个字符串（可以包含用户信息的字符串），用户访问别的模块请求就会带着这个字符串（字符串可以是在cookie里，
     * 也可以在地址栏里）服务端解析字符串就能判断是不是用户信息
     */
}