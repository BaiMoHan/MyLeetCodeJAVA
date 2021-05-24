package JZ20;

import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 20 包含min函数的栈
 * @Author BaiMohan
 * @Date 2021/5/22 15:39
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int node) {
        s1.push(node);
        if (s2.isEmpty()) s2.push(node);
        else if (node <= s2.peek()) s2.push(node);
    }

    public void pop() {
        int value = s1.pop();
        if (value == s2.peek()) s2.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }
}
