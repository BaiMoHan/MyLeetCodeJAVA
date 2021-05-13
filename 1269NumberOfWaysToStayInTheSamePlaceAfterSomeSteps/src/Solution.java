/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1269
 * @Author BaiMohan
 * @Date 2021/5/13 11:05
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int numWays(int steps, int arrLen) {
        final int MOD = 1000000007;
        int max =  Math.min(steps,arrLen);
        int[][] dp = new int[steps+1][max];
        dp[0][0] = 1;
        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j < max; j++) {
                // 原地不动肯定可以走
                dp[i][j] = dp[i-1][j];
                if(j-1>=0)
                    dp[i][j]=(dp[i][j]+dp[i-1][j-1])%MOD;
                if(j+1<max)
                    dp[i][j]=(dp[i][j]+dp[i-1][j+1])%MOD;
            }
        }
        return dp[steps][0];
    }
}
