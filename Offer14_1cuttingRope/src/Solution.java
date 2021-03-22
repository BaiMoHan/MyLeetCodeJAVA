/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/22 22:34
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int cuttingRope(int n) {
        if(n<2){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int timesOf3=n/3;
        if(n-timesOf3*3==1){
            timesOf3--;
        }
        int timesOf2=(n-timesOf3*3)/2;
        return (int)(Math.pow(3,timesOf3))*(int)(Math.pow(2,timesOf2));
    }
    public int dpCutting(int n){
        int[] dp=new int[n+1];
        dp[1]=1;
        for (int i = 2; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),dp[j]*(i-j)));
            }
        }
        return dp[n];
    }
}
