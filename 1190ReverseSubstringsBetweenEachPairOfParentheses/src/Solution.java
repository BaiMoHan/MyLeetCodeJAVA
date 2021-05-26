import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1190
 * @Author BaiMohan
 * @Date 2021/5/26 23:13
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "(u(love)i)";
        s.reverseParentheses(str);
    }
    public String reverseParentheses(String s) {
        if (s == null || s.length() <= 0) return null;
        int n = s.length();
        Stack<Integer> stack = new Stack<>();
        int[] next = new int[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                int j = stack.pop();
                next[i] = j;
                next[j] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        int step = 1;
        for (int i = 0; i < n; i += step) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                i = next[i];
                step = -step;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
