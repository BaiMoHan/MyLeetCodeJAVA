import java.util.HashMap;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0001
 * 建立哈希表
 * @Author BaiMohan
 * @Date 2021/4/20 14:07
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        // 如果是先扫描一遍存表再查找，会出现自己+自己=target的情况 需要额外判断
        for (int i = 0; i < n; i++) {
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target -  nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
}
