/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0879
 * @Author BaiMohan
 * @Date 2021/6/9 13:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        final int MOD = (int) 1e9 + 7;
        int[][] dp = new int[n + 1][minProfit + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < group.length; i++) {
            int earn = profit[i];
            for (int j = n; j >= group[i]; j--) {
                for (int k = minProfit; k >= 0; k--) {
                    dp[j][k] = (dp[j][k] + dp[j - group[i]][Math.max(0, k - earn)]) % MOD;
                }
            }
        }
        return dp[n][minProfit];
    }
}
