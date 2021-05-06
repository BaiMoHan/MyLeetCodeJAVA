package NC68;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 68 跳台阶
 * @Author BaiMohan
 * @Date 2021/5/6 21:15
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int jumpFloor(int target) {
        if(target <= 0)
            return 0;
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        int dp1 = 1;
        int dp2 = 2;
        int res = 0;
        for (int i = 3; i <= target; i++) {
            res = dp2 + dp1;
            dp1 = dp2;
            dp2 = res;
        }
        return res;
    }
}
