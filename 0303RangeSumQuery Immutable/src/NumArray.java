/**
 * 类描述：
 *
 * @ClassName NumArray
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/1 15:49
 * @Version 1.0
 */
public class NumArray {
    public int[] sums;
    public NumArray(int[] nums) {
        int n=nums.length;
        sums=new int[n+1];
        for (int i = 0; i < n; i++) {
            sums[i+1]=nums[i]+sums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j+1]-sums[i];
    }
}
