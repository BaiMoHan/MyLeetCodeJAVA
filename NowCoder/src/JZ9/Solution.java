package JZ9;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer9 变态跳台阶
 * @Author BaiMohan
 * @Date 2021/5/22 11:14
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int jumpFloorII(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        int dp1 = 1;
        for (int i = 1; i < target; i++) {
            int dp2 = 2 * dp1;
            dp1 = dp2;
        }
        return dp1;
    }
}
