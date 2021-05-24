package JZ19;

import java.util.ArrayList;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 剑指offer 19 顺时针打印矩阵元素
 * @Author BaiMohan
 * @Date 2021/5/22 16:44
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] m = {{1, 2}, {3, 4}};
        System.out.println(s.printMatrix(m));
    }

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if (matrix == null || matrix[0] == null) return res;
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
            // 下
            if (start != end)
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[end][i]);
                }
            if (left != right)
                // 左
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
