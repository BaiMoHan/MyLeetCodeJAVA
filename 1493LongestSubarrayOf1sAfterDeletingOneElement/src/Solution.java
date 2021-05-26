/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1493
 * @Author BaiMohan
 * @Date 2021/5/26 23:49
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int l = 0, r = 0;
        int n = nums.length;
        int res = 0;
        while (r < n) {
            if (nums[r] == 0) {
                count++;
            }
            while (count > 1) {
                if (nums[l] == 0) {
                    count--;
                }
                l++;
            }
            res = Math.max(res, r - l);
            r++;
        }
        return res;
    }
}
