package JZ21;

import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer21 栈的压入、弹出序列
 * @Author BaiMohan
 * @Date 2021/5/22 14:57
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int n = pushA.length;
        int m = popA.length;
        int i = 0;
        int j = 0;
        Stack<Integer> s = new Stack<>();
        while (i<n){
            s.push(pushA[i]);
            i++;
            while(!s.isEmpty()&&j<m&&popA[j]==s.peek()){
                s.pop();
                j++;
            }
        }
        return s.isEmpty();
    }
}
