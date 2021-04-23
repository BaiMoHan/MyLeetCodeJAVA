/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0121
 * @Author BaiMohan
 * @Date 2021/4/23 14:26
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    int min =  Integer.MAX_VALUE;
    int res = 0;
    public int maxProfit(int[] prices) {
        int n = prices.length;
        for (int price : prices) {
            if(price<min){
                min = price;
            }
            if(price - min > res){
                res = price - min;
            }
        }
        return res;
    }
}
