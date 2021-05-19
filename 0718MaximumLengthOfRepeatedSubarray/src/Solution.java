/**
 * 类描述:
 *
 * @ClassName Solution
 * @Description 最长重复子数组 leetcode 0718
 * @Author baimohan
 * @Date 2021/5/19 8:31
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public static void main(String[] args) {
        int[] num1 = {1, 1, 0, 0, 1};
        int[] num2 = {1, 1, 0, 0, 0};
        Solution s = new Solution();
        s.findLength(num1, num2);
    }

    public int findLength(int[] nums1, int[] nums2) {
        return nums1.length < nums2.length ? findMax(nums1, nums2) : findMax(nums2, nums1);
    }

    private int findMax(int[] nums1, int[] nums2) {
        int res = 0;
        int n = nums1.length;
        int m = nums2.length;
        // 未完全覆盖串1，串2左边慢慢移入的过程
        for (int len = 1; len <= n; len++) {
            res = Math.max(res, maxLen(nums1, 0, nums2, m - len, len));
        }
        // 串2左边全移入覆盖串1向右边出，直到不完全覆盖串1为止的过程
        for (int j = m - n; j >= 0; j--) {
            res = Math.max(res, maxLen(nums1, 0, nums2, j, n));
        }
        // 串2右边开始离开串1的完全覆盖，直到串2与串1没有重叠部分
        for (int i = 1; i < n; i++) {
            res = Math.max(res, maxLen(nums1, i, nums2, 0, n - i));
        }
        return res;
    }

    private int maxLen(int[] nums1, int i, int[] nums2, int j, int len) {
        int count = 0;
        int max = 0;
        for (int k = 0; k < len; k++) {
            if (nums1[i + k] == nums2[j + k]) {
                count++;
            } else if (count > 0) {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return count > 0 ? Math.max(max, count) : max;
    }
}
