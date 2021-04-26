/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1011
 * @Author BaiMohan
 * @Date 2021/4/26 23:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        int l = 0;
        int r = sum;
        while (l<r){
            int mid = l + r >> 1;
            if(check(weights,mid,D)) r = mid;
            else l=mid+1;
        }
        return l;
    }
    public boolean check(int[] weights,int x,int d){
        int cnt = 1;
        int s = 0;
        for (int i = 0; i < weights.length; i++) {
            if(weights[i]>x) return false;
            if(s+weights[i]>x){
                cnt++;
                s = 0;
            }
            s+=weights[i];
        }
        return cnt<=d;
    }

}
