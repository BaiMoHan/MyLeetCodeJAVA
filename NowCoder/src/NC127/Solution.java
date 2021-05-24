package NC127;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 127
 * @Author BaiMohan
 * @Date 2021/5/24 19:05
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public String LCS(String str1, String str2) {
        int res = 0;
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];
        int index = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > res) {
                        res = dp[i][j];
                        index = j;
                    }
                }
            }
        }
        return index == -1 ? "-1" : str2.substring(index - res, index);
    }
}
