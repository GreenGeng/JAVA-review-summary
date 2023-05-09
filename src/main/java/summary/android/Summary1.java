package summary.android;

public class Summary1 {
    /**
     * 安卓系统基于Linux
     *
     * 使用到工具msf
     *
     *
     * 如果遇到 apt-get update失败的话
     * 不能盲目修改sources.list
     * 需要在https://mirrors.ustc.edu.cn/repogen/ 选择合适的源 在加到sources.list里
     * 然后apt-get update && apt-get upgrade
     *
     *
     * 什么是免杀
     *
     * 安卓安全
     * 可以把下载的apk后缀名改成zip就可以看到目录结构
     * android killer 安卓逆向必备
     *
     *
     * jni
     * Java本地接口
     * 是一种协议 通过JNI让Java调用C或CPP
     *
     *
     * smali语法
     * 开发的逻辑都在smali文件里
     * 数据类型
     * B-byte
     * C-char
     * D-double
     * F-float
     * I-int
     * J-long
     * S_short
     * V-void
     * Z-boolean
     * [XXX-array eg [B表示Byte数组
     * Lxxx/yyy---object eg [java/lang/String表示string
     *
     * 方法定义
     * 方法名（参数...）返回值
     * Hello()V 表示 void Hello()
     *
     * .field定义变量
     * .prologue 方法开始
     * .line 123 表示此方法位于第123行
     * invoke-direct 调用函数
     * return-void 返回void
     * const/high v0,123 把123赋值给v0
     * .end method 函数结束
     * new-instance 创建实例
     * iput-object 对象赋值
     * iget-object 调用对象
     * invoke-static  调用静态函数
     * .locals 本地寄存器
     * :cond_ 表示代码块
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
