package NC88;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 88
 * @Author BaiMohan
 * @Date 2021/5/25 9:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int findKth(int[] a, int n, int K) {
        return quickSort(a, 0, n - 1, K);
    }

    private int quickSort(int[] a, int left, int right, int k) {
        int base = a[left];
        int l = left, r = right;
        while (l < r) {
            // 从大到小排列
            while (l < r && a[r] <= base) {
                r--;
            }
            a[l] = a[r];
            while (l < r && a[l] >= base) {
                l++;
            }
            a[r] = a[l];
        }
        a[l] = base;
        if (l == k - 1) return a[l];
        else if (l < k - 1) return quickSort(a, l + 1, right, k);
        else return quickSort(a, left, l - 1, k);
    }
}
