/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1720
 * @Author BaiMohan
 * @Date 2021/5/6 18:11
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] res = new int[n+1];
        res[0] = first;
        for (int i = 1; i < n + 1; i++) {
            res[i] = first ^ encoded[i-1];
            first = res[i];
        }
        return res;
    }
}
