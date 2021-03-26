/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 打家劫舍
 * @Author BaiMohan
 * @Date 2021/3/26 19:28
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int rob(int[] nums) {
        int dp1 = 0, dp2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.max(dp1 + nums[i], dp2);
            dp1 = dp2;
            dp2 = cur;
        }
        return dp2;
    }
}
