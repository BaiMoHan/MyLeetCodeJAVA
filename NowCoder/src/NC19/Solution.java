package NC19;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 19
 * @Author BaiMohan
 * @Date 2021/5/6 21:28
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public int maxsumofSubarray (int[] arr) {
        int res = 0;
        int cur = 0;
        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];
            res =  Math.max(res,cur);
            cur = cur > 0? cur : 0;
        }
        return res;
    }
}
