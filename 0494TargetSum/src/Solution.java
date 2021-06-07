/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0494
 * @Author BaiMohan
 * @Date 2021/6/7 9:41
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        long sum = 0L;
        for (int num : nums) {
            sum += num;
        }
        int neg = (int) (sum - target);
        if (neg < 0 || neg % 2 != 0) {
            return 0;
        }
        neg /= 2;
        int[] dp = new int[neg + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = neg; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }
        return dp[neg];
    }
}
