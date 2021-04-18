/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0026
 * @Author BaiMohan
 * @Date 2021/4/18 18:09
 * @Version 1.0
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length<=0){
            return 0;
        }
        int p=0;
        int q=1;
        while(q<nums.length){
            if(nums[q]!=nums[p]){
                nums[p+1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
