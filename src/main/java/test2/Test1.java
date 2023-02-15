package test2;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    ////arraylist扩容

    public static void main(String[] args) {
        //默认是10 但是加了20个元素 就会扩容
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        // add方法里先调用确认内部容量方法
        // 再调用grow方法进行1.5倍扩容
        //
//        public boolean add(E e) {
//            ensureCapacityInternal(size + 1);  // Increments modCount!!
//            elementData[size++] = e;
//            return true;
//        }
        // grow()方法里新的容量
        //   int newCapacity = oldCapacity + (oldCapacity >> 1);


    }
}
