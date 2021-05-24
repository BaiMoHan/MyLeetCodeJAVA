package NC7;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 7
 * @Author BaiMohan
 * @Date 2021/5/24 16:59
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null) return 0;
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            } else {
                res = Math.max(prices[i] - min, res);
            }
        }
        return res;
    }
}
