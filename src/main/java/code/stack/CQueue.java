package code.stack;

import java.util.Stack;

public class CQueue {
    Stack<Integer> stack1;// 加元素
    Stack<Integer> stack2; // 删元素

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();

    }

    public void appendTail(int value) {
        // 1来添加元素
        stack1.push(value);
    }

    public int deleteHead() {

        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                // 1和2都是空的
                return -1;
            }
            while (!stack1.isEmpty()){
                //把1的值加到2里
                stack2.push(stack1.pop());
            }
        }
        // 2不是空的就直接弹出来
        return stack2.pop();

    }
}