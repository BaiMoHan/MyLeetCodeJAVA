package NC22;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 22
 * @Author BaiMohan
 * @Date 2021/5/23 14:16
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int index = m + n - 1;
        int i = m - 1;
        int j = n - 1;
        while (index >= 0) {
            if (j < 0) {
                A[index] = A[i];
                i--;
            } else if (i < 0) {
                A[index] = B[j];
                j--;
            } else if (A[i] < B[j]) {
                A[index] = B[j];
                j--;
            } else {
                A[index] = A[i];
                i--;
            }
            index--;
        }
    }
}
