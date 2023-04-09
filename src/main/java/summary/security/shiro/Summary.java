package summary.security.shiro;

public class Summary {
    /**
     *
     * 使用shiro工具时候会报错，因为java 的版本太高了
     * mac里给Java版本降级的方式
     * 输入export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
     *
     *
     * 判断是否使用shiro的当时
     * 有代码的话就直接在代码里搜shiro
     * 没代码的话就抓包看登陆的请求里有没有remember me
     *
     *
     * shiro的AES加密做了一次更新
     * 从CBC改为GCM
     *
     * shiro的流程
     * 1：生成cookie：序列化 => 使用密钥进行AES加密 => Base64编码，最后返回客户端 remebreme Cookie；
     * 2： 识别cookie：得到rememberMe的cookie值=>Base64解码=>使用密钥进行AES解密=>反序列化。
     *
     * 原理
     * 因为AES加密的key是被硬编码的 会泄漏
     * (使用到了CookieRememberMeManager这个类 这个类继承了AbstractRememberMeManager
     * 在AbstractRememberMeManager这里默认使用的就是Aes加密
     *     public AbstractRememberMeManager() {
     *         AesCipherService cipherService = new AesCipherService();
     *         this.cipherService = cipherService;
     *         this.setCipherKey(cipherService.generateNewKey().getEncoded());
     *     }
     *    然后使用CookieRememberMeManager的对象进行Base64编码
     *  cookieRememberMeManager.setCipherKey(Base64.decode("fCq+/xW488hMTCD+cmJ3aQ=="));
     *
     *
     *  )
     *
     *  攻击者只要找到AES的key
     *  构造恶意的对象 加密、编码之后发送给服务器 服务器进行解码用key解密就会执行反序列化漏洞
     *
     *  修复
     *  CBC改成了GCM
     *  随机生成密钥
     *
     *
     * md5和base64的区别
     * md5是不可逆的  base64可逆
     *
     *
     *
     * ruoyi有一个数据权限
     * @datascope
     * 这个利用AOP动态拼接SQL（这里需要注意SQL注入）
     *
     *
     *
     */
}
