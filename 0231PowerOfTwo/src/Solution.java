/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0231
 * @Author BaiMohan
 * @Date 2021/5/30 17:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
