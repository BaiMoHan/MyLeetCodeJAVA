/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 80
 * @Author BaiMohan
 * @Date 2021/4/6 21:50
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null) return 0;
        if(nums.length<3) return nums.length;
        int k=1;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-1])
                nums[++k]=nums[i];
        }
        k++;
        return k;
    }
}
