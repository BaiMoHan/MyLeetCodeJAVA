package JZ13;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 13
 * @Author BaiMohan
 * @Date 2021/5/22 16:25
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int[] reOrderArray(int[] array) {
        int oddNum = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if ((array[i] & 1) == 1) {
                oddNum++;
            }
        }
        int[] res = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if ((array[i] & 1) == 1) {
                res[index] = array[i];
                index++;
            } else {
                res[oddNum] = array[i];
                oddNum++;
            }
        }
        return res;
    }
}
