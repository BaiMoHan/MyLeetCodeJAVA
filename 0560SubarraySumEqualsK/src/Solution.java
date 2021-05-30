import java.util.HashMap;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0560
 * @Author BaiMohan
 * @Date 2021/5/30 19:04
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int pre = 0;
        int count = 0;
        hashMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            if (hashMap.containsKey(pre - k)) {
                count += hashMap.get(pre - k);
            }
            hashMap.put(pre, hashMap.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
