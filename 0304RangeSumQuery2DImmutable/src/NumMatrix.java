

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/2 13:06
 * @Version 1.0
 */
public class NumMatrix {
    int[][] nums;
    public NumMatrix(int[][] matrix) {
        int m=matrix.length;
        if(m>0){
            int n=matrix[0].length;
            nums=new int[m+1][n+1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    nums[i+1][j+1]=nums[i+1][j]+nums[i][j+1]-nums[i][j]+matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return nums[row2+1][col2+1]-nums[row1][col2+1]-nums[row2+1][col1]+nums[row1][col1];
    }
}
