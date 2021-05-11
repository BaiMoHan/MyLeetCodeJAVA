/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1734
 * @Author BaiMohan
 * @Date 2021/5/11 22:13
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int all = 1;
        for (int i = 2; i <= n; i++) {
            all^=i;
        }
        int num = 0;
        for (int i = 0; i < n-1; i+=2) {
            num ^= encoded[i];
        }
        int last = all ^ num;
        int[] res = new int[n];
        res[n-1] = last;
        for (int i = n-2; i >= 0; i--) {
            res[i] = res[i+1] ^ encoded[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] code = {6,5,4,6};
        solution.decode(code);
    }
}
