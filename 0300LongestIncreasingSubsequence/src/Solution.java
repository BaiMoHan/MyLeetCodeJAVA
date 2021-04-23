import java.util.Arrays;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0300
 * @Author BaiMohan
 * @Date 2021/4/22 23:34
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int res = 0;
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
            res = Math.max(dp[i], res);
        }
        return res;
    }

    public int lengthOfLISByLogN(int[] nums) {
        int[] tails = new int[nums.length];
        int res = 0;
        for (int num : nums) {
            int i = 0;
            int j = res;
            while (i < j) {
                int m = (i + j) / 2;
                if (tails[m] < num) i = m + 1;
                else j = m;
            }
            tails[i] = num;
            if (res == j) res++;
        }
        return res;
    }

}
