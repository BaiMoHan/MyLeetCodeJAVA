/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1310
 * @Author BaiMohan
 * @Date 2021/5/12 16:33
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] res = new int[n+1];
        res[0] = 0;
        for (int i = 0; i < n; i++) {
            res[i+1] = res[i] ^ arr[i];
        }
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = res[queries[i][0]] ^ res[queries[i][1]+1];
        }
        return ans;
    }
}
