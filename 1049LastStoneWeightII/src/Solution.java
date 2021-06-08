/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1049
 * @Author BaiMohan
 * @Date 2021/6/8 19:31
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int s : stones) {
            sum += s;
        }
        int m = sum / 2;
        boolean dp[] = new boolean[m + 1];
        dp[0] = true;
        for (int s : stones) {
            for (int i = m; i > s; i--) {
                dp[i] = dp[i - s] || dp[i];
            }
        }
        for (int i = m; i > 0; i--) {
            if (dp[i])
                return sum - 2 * i;
        }
        // leetcode 上下面不能写，但是IDEA下面要写防止报错
        return 0;
    }
}
