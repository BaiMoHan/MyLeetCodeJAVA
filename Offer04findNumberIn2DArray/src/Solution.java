/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 15:25
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (null == matrix || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;
        int row = 0, col = cols - 1;//起始点从右上角开始
        while (row <= rows - 1 && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;//小于在左边
            } else {
                row++;//大于在下边
            }
        }
        return false;
    }
}
