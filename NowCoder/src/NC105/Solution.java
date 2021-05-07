package NC105;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 105
 * @Author BaiMohan
 * @Date 2021/5/7 8:50
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int search(int[] nums, int target) {
        // write code here
        if (nums.length <= 0)
            return -1;
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + r >> 1;
            if (nums[mid] >= target) r = mid;
            else l = mid + 1;
        }
        return nums[l] == target ? l : -1;
    }
}
