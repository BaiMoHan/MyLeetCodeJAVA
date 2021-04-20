import java.util.HashSet;
import java.util.Set;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0003
 * @Author BaiMohan
 * @Date 2021/4/20 14:34
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int q = -1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            if(i!=0){
                set.remove(s.charAt(i-1));
            }
            while (q+1<n&& !set.contains(s.charAt(q+1))){
                q++;
                set.add(s.charAt(q));
            }
            res = Math.max(res,q-i+1);
        }
        return res;
    }
}
