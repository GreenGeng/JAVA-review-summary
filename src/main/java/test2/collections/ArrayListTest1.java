package test2.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {
    ////arraylist扩容

    public static void main(String[] args) {
        //默认是10 但是加了20个元素 就会扩容
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        /**
         *      安全的list
         *      CopyOnWriteArrayList：底层有一个volatile数组，更新数组的时候，先创建一个新数组
         *      把更新值复制进去，然后把新数组赋值给volatile数组，就可以读写分离
         *      Collections.SynchronizedList:
         *
         *
         *      add方法里先调用确认内部容量方法
         *          再调用grow方法进行1.5倍扩容
         *
         *         public boolean add(E e) {
         *             ensureCapacityInternal(size + 1);  // Increments modCount!!
         *             elementData[size++] = e; //这里的size++是线程不安全的
         *             return true;
         *         }
         *          grow()方法里新的容量
         *            int newCapacity = oldCapacity + (oldCapacity >> 1);
         *
         *
         *   类似的还有stringbuffer和stringbuilder
         *   stringbuffer是线程安全的 因为他的方法都加了syn锁
         *   stringbuilder是线程不安全的 因为他扩容里和arrayList一样 方法写的一模一样
         *   先扩容 再把元素写进去
         *   springbuilder扩容：初始长度2倍+2
         *
         *   public AbstractStringBuilder append(char c) {
         *         ensureCapacityInternal(count + 1);
         *         value[count++] = c;     // count++ 是线程不安全的
         *         return this;
         *     }
         *
         */



    }
}
