/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 剑指offer 53
 * @Author BaiMohan
 * @Date 2021/5/21 10:00
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int j =nums.length;
        while (i<j){
            int mid = i + j >>1;
            if(nums[mid]!=mid) j = mid;
            else i = mid + 1;
        }
        return i;
    }
}
