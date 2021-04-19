/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0027
 * @Author BaiMohan
 * @Date 2021/4/19 18:07
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int removeElement(int[] nums, int val) {

        if(nums==null||nums.length<=0){
            return 0;
        }
        int n = nums.length;
        int p = -1;
        int q = 0;
        while(q!=n){
            if(nums[q]!=val){
                p++;
                nums[p] = nums[q];
            }
            q++;
        }
        return p==-1?0:p+1;
    }
}
