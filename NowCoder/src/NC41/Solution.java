package NC41;

import java.util.HashSet;
import java.util.Set;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 41 最长无重复子串
 * @Author BaiMohan
 * @Date 2021/5/7 8:23
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int maxLength(int[] arr) {
        // write code here
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int n = arr.length;
        int res = 0;
        while (j < n) {
            if (set.contains(arr[j])) {
                res = Math.max(j - i, res);
                set.remove(arr[i]);
                i++;
            } else {
                set.add(arr[j]);
                j++;
            }
        }
        return res;
    }
}
