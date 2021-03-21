

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 15:58
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] ints = solution.spiralOrder(matrix);
        System.out.println(ints);
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
            return new int[0];
        }

        int up = 0, buttom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        int[] res = new int[(buttom + 1) * (right + 1)];
        int k = 0;
        while (up <= buttom && left <= right) {
            //从左到右打印一遍
            for (int i = left; i <= right; i++) {
                res[k++] = matrix[up][i];
            }
            //到达最右上角的顶点后从上到下打印
            for (int i = up + 1; i <= buttom; i++) {
                res[k++] = matrix[i][right];
            }
            //到达最右下角顶点后，从右到左打印
            if (up != buttom) {
                for (int i = right - 1; i >= left; i--) {
                    res[k++] = matrix[buttom][i];
                }
            }
            //到达最左下角顶点后，从下往上打印
            if (left != right) {
                for (int i = buttom - 1; i > up; i--) {
                    res[k++] = matrix[i][left];
                }
            }
            //一圈打印完后调整矩阵的新边界
            up++;
            buttom--;
            left++;
            right--;
        }
        return res;
    }
}
