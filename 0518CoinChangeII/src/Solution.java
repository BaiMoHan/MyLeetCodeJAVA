/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0518
 * @Author BaiMohan
 * @Date 2021/6/10 14:39
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
