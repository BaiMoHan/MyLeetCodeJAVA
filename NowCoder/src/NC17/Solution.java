package NC17;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 17
 * @Author BaiMohan
 * @Date 2021/5/25 19:02
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public int getLongestPalindrome(String A, int n) {
        if (A == null) return 0;
        if (n < 2) return 1;
        n = n * 2 + 1;
        int[] p = new int[n];
        char[] str = addSplit(A);
        int index = 0;
        int res = 1;
        int center = 0;
        int maxRight = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (i < maxRight) {
                int mirror = 2 * center - i;
                p[i] = Math.min(maxRight - i, p[mirror]);
            }
            int left = i - (1 + p[i]);
            int right = i + (1 + p[i]);
            while (left >= 0 && right < n && str[left] == str[right]) {
                left--;
                right++;
                p[i]++;
            }
            if (i + p[i] > maxRight) {
                maxRight = i + p[i];
                center = i;
            }
            if (p[i] > res) {
                res = p[i];
                start = (i - res) / 2;
            }
        }
        return res;
    }

    public char[] addSplit(String str) {
        int n = str.length();
        n = n * 2 + 1;
        int index = 0;
        char[] res = new char[n];
        for (int i = 0; i < n; i++) {
            res[i] = (i & 1) == 0 ? '#' : str.charAt(index++);
        }
        return res;
    }

}
