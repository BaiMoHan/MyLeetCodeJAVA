package NC48;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 48
 * @Author BaiMohan
 * @Date 2021/5/7 9:45
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {6, 8, 10, 0, 2, 4};
        int[] num1 = {1};
        int t1 = 0;
        int t = 10;
//        System.out.println(s.search(num, t));
        System.out.println(s.search(num1, t1));
    }

    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + r >> 1;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < nums[r]) {
                if (target > nums[mid]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (target > nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
