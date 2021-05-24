package NC38;

import java.util.ArrayList;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 38
 * @Author BaiMohan
 * @Date 2021/5/24 20:15
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        int start = 0;
        int end = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (start <= end && left <= right) {
            // 上
            for (int i = left; i <= right; i++) {
                res.add(matrix[start][i]);
            }
            // 右
            for (int i = start + 1; i <= end; i++) {
                res.add(matrix[i][right]);
            }
            if (start != end)
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[end][i]);
                }
            if (left != right)
                for (int i = end - 1; i > start; i--) {
                    res.add(matrix[i][left]);
                }
            start++;
            left++;
            right--;
            end--;
        }
        return res;
    }
}
