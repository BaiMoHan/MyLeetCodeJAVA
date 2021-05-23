package NC1;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 1
 * @Author BaiMohan
 * @Date 2021/5/23 14:27
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public String solve(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1, j = t.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int a = 0, b = 0;
            if (i >= 0) {
                a = s.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                b = t.charAt(j) - '0';
                j--;
            }
            int sum = a + b + carry;
            carry = sum / 10;
            sum %= 10;
            sb.append(sum);
        }
        return new String(sb.reverse());
    }
}
