/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1744
 * @Author BaiMohan
 * @Date 2021/6/1 13:29
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;
        // 前缀和需要用long防止溢出
        long[] sum = new long[n];
        int m = queries.length;

        boolean[] res = new boolean[m];
        sum[0] = candiesCount[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + candiesCount[i];
        }
        for (int i = 0; i < m; i++) {
            int type = queries[i][0];
            // 注意day也用long防止后面 day+1 溢出了
            long day = queries[i][1];
            int cap = queries[i][2];
            long x1 = day + 1;
            // 注意此处乘法可能溢出 如果上面day用了long 那这里可以不用强转long
            long y1 = (long)(cap * (day+1));
            long x2 = type == 0 ? 1 : sum[type - 1] + 1;
            long y2 = sum[type];
            if (x1 > y2 || x2 > y1) {
                res[i] = false;
            } else {
                res[i] = true;
            }
        }
        return res;
    }
}
