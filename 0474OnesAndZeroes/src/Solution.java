/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0474
 * @Author BaiMohan
 * @Date 2021/6/6 19:52
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int findMaxFormUnImprove(String[] strs, int m, int n) {
        int l = strs.length;
        int[][][] dp = new int[l+1][m+1][n+1];
        for (int i = 1; i <= l; i++) {
            int len = strs[i-1].length();
            int zero=count(strs[i-1]);
            int one = len -zero;
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k]=dp[i-1][j][k];
                    if(j>=zero&&k>=one){
                        dp[i][j][k]=Math.max(dp[i][j][k],dp[i-1][j-zero][k-one]+1);
                    }
                }
            }
        }
        return dp[l][m][n];
    }
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for (String str : strs) {
            int zero = count(str);
            int one = str.length()-zero;
            for (int i = m; i >= zero; i--) {
                for (int k = n; k >= one; k--) {
                    dp[i][k]=Math.max(dp[i][k],dp[i-zero][k-one]+1);
                }
            }
        }
        return dp[m][n];
    }
    public int count(String str){
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)=='0'){
                res++;
            }
        }
        return res;
    }
}
