package NC79;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 79
 * @Author BaiMohan
 * @Date 2021/5/7 8:57
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;
        int i = 0, j = 0, k = 0;
        int[] dp = new int[index];
        dp[0] = 1;
        for (int t = 1; t < index; t++) {
            dp[t] = Math.min(dp[i] * 2, Math.min(dp[j] * 3, dp[k] * 5));
            if (dp[t] == dp[i] * 2) i++;
            if (dp[t] == dp[j] * 3) j++;
            if (dp[t] == dp[k] * 5) k++;
        }
        return dp[index - 1];

    }
}
