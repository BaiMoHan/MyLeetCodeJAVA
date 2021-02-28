/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/2/28 14:44
 * @Version 1.0
 */
class Solution {
    public boolean isMonotonic(int[] A) {
        int size = A.length;
        boolean inc = true, dec = true;
        for (int i = 0; i < size - 1; i++) {
            if (A[i] < A[i + 1]) {
                dec = false;
            }
            if (A[i] > A[i + 1]) {
                inc = false;
            }
        }
        return dec || inc;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 5, 4};
        System.out.println(new Solution().isMonotonic(A));
    }
}
