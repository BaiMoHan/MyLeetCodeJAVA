package JZ1;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指offer 1
 * @Author BaiMohan
 * @Date 2021/5/16 14:50
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean Find(int target, int[][] array) {
        int n = array.length;
        int m = array[0].length;
        int i = 0, j = m - 1;
        while (0 <= i && i < n && 0 <= j && j < m) {
            if (target == array[i][j])
                return true;
            else if (target < array[i][j])
                j--;
            else
                i++;
        }
        return false;
    }
}
