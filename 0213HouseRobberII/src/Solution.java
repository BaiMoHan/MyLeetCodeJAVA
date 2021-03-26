/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 0213
 * @Author BaiMohan
 * @Date 2021/3/26 19:36
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob(nums,0, nums.length-1),rob(nums,1, nums.length));
    }

    public int rob(int[] nums, int begin, int end) {
        int dp1 = 0, dp2 = 0;
        for (int i = begin; i < end; i++) {
            int cur = Math.max(dp1 + nums[i], dp2);
            dp1 = dp2;
            dp2 = cur;
        }
        return dp2;
    }

}
