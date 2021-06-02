import java.util.HashMap;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0523
 * @Author BaiMohan
 * @Date 2021/6/2 16:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < 2) {
            return false;
        }
        int pre = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            pre = (pre + nums[i]) % k;
            if (map.containsKey(pre)) {
                int start = map.get(pre);
                if (i - start >= 2) {
                    return true;
                }
            } else {
                map.put(pre, i);
            }
        }
        return false;
    }
}
