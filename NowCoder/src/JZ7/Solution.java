package JZ7;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer7 斐波拉契数列
 * @Author BaiMohan
 * @Date 2021/5/22 11:06
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int Fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int dp1 = 0;
        int dp2 = 1;
        for (int i = 2; i < n; i++) {
            int dp3 = dp2 + dp1;
            dp1 = dp2;
            dp2 = dp3;
        }
        return dp2;
    }
}
