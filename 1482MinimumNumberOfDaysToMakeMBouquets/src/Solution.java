/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 1482
 * @Author BaiMohan
 * @Date 2021/5/9 22:16
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n<m*k) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            low = Math.min(bloomDay[i],low);
            high = Math.max(bloomDay[i],high);
        }
        while (low<high){
            int mid = low + high >> 1;
            if(check(bloomDay,m,k,mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private boolean check(int[] bloomDay, int m, int k, int day) {
        int flowers = 0;
        int cnt = 0;
        int n = bloomDay.length;
        for (int i = 0; i < n; i++) {
            if(bloomDay[i]<=day){
                flowers ++;
                if(flowers == k){
                    cnt++;
                    flowers = 0;
                    if(cnt == m){
                        return true;
                    }
                }
            }else{
                flowers = 0;
            }
        }
        return false;
    }
}
