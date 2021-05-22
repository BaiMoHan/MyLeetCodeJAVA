package JZ42;

import java.util.ArrayList;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 42 和为S的两个数字
 * @Author BaiMohan
 * @Date 2021/5/22 18:48
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] < sum) {
                i++;
            } else if (array[i] + array[j] == sum) {
                res.add(array[i]);
                res.add(array[j]);
                return res;
            } else {
                j--;
            }
        }
        return res;
    }
}
