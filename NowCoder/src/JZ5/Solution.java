package JZ5;

import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 5 用两个栈实现一个队列
 * @Author BaiMohan
 * @Date 2021/5/22 9:47
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty())
            pushToPop();
        return stack2.pop();
    }

    public void pushToPop() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
