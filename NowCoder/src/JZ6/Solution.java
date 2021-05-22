package JZ6;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 6 寻找旋转数组中的最小值
 * @Author BaiMohan
 * @Date 2021/5/22 10:01
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length <= 0) return 0;
        int n = array.length-1;
        while (n>0&&array[n]==array[0]) n--;
        if(array[n]>array[0]) return array[0];
        int l = 0;
        int r = array.length;
        while (l < r) {
            int mid = l + r >> 1;
            if (array[mid] > array[0]) l = mid + 1;
            else r = mid;
        }
        return array[l];
    }
}
