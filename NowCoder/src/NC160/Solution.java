package NC160;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 160 二分查找
 * @Author BaiMohan
 * @Date 2021/5/21 17:42
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length;
        while (i < j) {
            int mid = i + j >> 1;
            if (nums[mid] > target) j = mid;
            else i = mid + 1;
        }
        return nums[i] == target ? i : -1;
    }
}
