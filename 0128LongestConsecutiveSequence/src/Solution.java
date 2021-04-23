import java.util.HashSet;
import java.util.Set;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0128
 * @Author BaiMohan
 * @Date 2021/4/23 17:05
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int len=0;
        int cur=0;
        for (int num : nums) {
            if(set.contains(num-1)){
                continue;
            }
            cur=num;
            int temp=1;
            while (set.contains(cur+1)){
                temp++;
                cur++;
            }
            len=Math.max(len,temp);
        }
        return len;
    }
}
