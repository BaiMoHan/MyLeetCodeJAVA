/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description Climbing Stairs
 * @Author BaiMohan
 * @Date 2021/3/26 19:16
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int climbStairs(int n) {
        if (n < 2) {
            return n;
        }
        int dp1 = 1, dp2 = 2;
        for (int i = 2; i < n; i++) {
            int cur = dp1 + dp2;
            dp1 = dp2;
            dp2 = cur;
        }
        return dp2;
    }
}
