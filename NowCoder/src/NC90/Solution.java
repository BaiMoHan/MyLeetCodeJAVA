package NC90;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 90
 * @Author BaiMohan
 * @Date 2021/5/24 10:55
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public int[] getMinStack(int[][] op) {
        int size = op.length;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            switch (op[i][0]) {
                case 1:
                    push(op[i][1]);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    res.add(min());
                    break;
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }

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
