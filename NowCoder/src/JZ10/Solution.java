package JZ10;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 10 矩形覆盖
 * @Author BaiMohan
 * @Date 2021/5/22 11:19
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int rectCover(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        int dp1 = 1;
        int dp2 = 2;
        for (int i = 2; i < target; i++) {
            int dp3 = dp2 + dp1;
            dp1 = dp2;
            dp2 = dp3;
        }
        return dp2;
    }
}
