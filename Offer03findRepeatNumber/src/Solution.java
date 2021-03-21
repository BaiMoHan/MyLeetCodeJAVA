/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 14:26
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public static void main(String[] args) {
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        Solution solution=new Solution();
        int res = solution.findRepeatNumber(nums);
        System.out.println(res);
    }
    public int findRepeatNumber(int[] nums) {
        if (null == nums || nums.length <= 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums,i,nums[i]);
            }
        }
        return 0;
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
