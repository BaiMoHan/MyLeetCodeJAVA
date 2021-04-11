/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0264
 * @Author BaiMohan
 * @Date 2021/4/11 23:12
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int i = 0, j = 0, k = 0;
        for (int t=1;t<n;t++) {
            int temp = Math.min(dp[i] * 2, Math.min(dp[j] * 3, dp[k] * 5));
            if (temp == dp[i] * 2) i++;
            if (temp == dp[j] * 3) j++;
            if (temp == dp[k] * 5) k++;
            dp[t]=temp;
        }
        return dp[n-1];
    }
}
