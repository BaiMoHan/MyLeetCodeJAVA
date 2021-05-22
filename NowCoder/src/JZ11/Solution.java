package JZ11;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 11 二进制中1的个数
 * @Author BaiMohan
 * @Date 2021/5/22 11:24
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            n = n & (n - 1);
            cnt++;
        }
        return cnt;
    }
}
