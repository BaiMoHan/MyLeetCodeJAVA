/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0011
 * @Author BaiMohan
 * @Date 2021/4/20 14:47
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int maxArea(int[] height) {
        int q = height.length - 1;
        int p = 0;
        int res = 0;
        while (p < q) {
            int min = Math.min(height[p], height[q]);
            int temp = (q - p) * min;
            res = Math.max(res, temp);
            if (height[p] != min) {
                q--;
            } else {
                p++;
            }
        }
        return res;
    }
}
