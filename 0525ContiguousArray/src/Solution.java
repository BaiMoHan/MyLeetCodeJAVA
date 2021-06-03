import java.util.HashMap;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0525
 * @Author BaiMohan
 * @Date 2021/6/3 16:33
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int findMaxLength(int[] nums) {
        int pre = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(pre, -1);
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                pre++;
            } else {
                pre--;
            }
            if (map.containsKey(pre)) {
                int temp = i - map.get(pre);
                res = Math.max(res, temp);
            } else {
                map.put(pre, i);
            }
        }
        return res;
    }
}
