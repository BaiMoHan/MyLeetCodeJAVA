/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 21:30
 * @Version 1.0
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] == target) {
                return new int[]{nums[i], nums[j]};
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
