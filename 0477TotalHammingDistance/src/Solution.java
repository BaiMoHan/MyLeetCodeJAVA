/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0477
 * @Author BaiMohan
 * @Date 2021/5/28 23:31
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {

    public int totalHammingDistance(int[] nums) {
        int ans = 0, n = nums.length;
        for (int i = 0; i < 30; ++i) {
            int c = 0;
            for (int val : nums) {
                c += (val >> i) & 1;
            }
            ans += c * (n - c);
        }
        return ans;
    }
}
