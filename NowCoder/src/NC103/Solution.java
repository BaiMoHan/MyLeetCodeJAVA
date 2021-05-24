package NC103;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 103
 * @Author BaiMohan
 * @Date 2021/5/24 19:54
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public String solve(String str) {
        int n = str.length();
        char[] res = new char[n];
        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            res[index++] = str.charAt(i);
        }
        return new String(res);
    }
}
