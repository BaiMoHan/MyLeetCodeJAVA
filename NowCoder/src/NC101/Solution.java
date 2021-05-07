package NC101;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 101
 * @Author BaiMohan
 * @Date 2021/5/7 9:24
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int solve(int[] a) {
        // write code here
        if (a == null || a.length <= 0) return 0;
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int mid = l + r >> 1;
            if (a[mid] != mid) r = mid;
            else l = mid + 1;
        }

        return a[l] == l ? l + 1 : l;
    }
}
