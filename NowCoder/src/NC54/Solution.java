package NC54;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 54
 * @Author BaiMohan
 * @Date 2021/5/25 20:22
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (num == null || num.length < 3) return res;
        Arrays.sort(num);
        for (int k = 0; k < num.length - 2; k++) {
            if (num[k] > 0) break;
            if (k > 0 && num[k] == num[k - 1]) continue;
            int i = k + 1, j = num.length - 1;
            while (i < j) {
                int sum = num[k] + num[i] + num[j];
                if (sum < 0) {
                    while (i < j && num[i] == num[++i]) ;
                } else if (sum > 0) {
                    while (i < j && num[j] == num[--j]) ;
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(num[k], num[i], num[j])));
                    while (i < j && num[i] == num[++i]) ;
                    while (i < j && num[j] == num[--j]) ;
                }
            }
        }
        return res;
    }
}
