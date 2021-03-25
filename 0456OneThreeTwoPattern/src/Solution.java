import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0456
 * @Author BaiMohan
 * @Date 2021/3/25 21:02
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] nums={3,1,4,2};
        System.out.println(solution.find132pattern(nums));
    }
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int k = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i>=0; i--) {
            if (nums[i] < k) {
                return true;
            } else {
                if (stack.empty()) {
                    stack.push(nums[i]);
                } else {
                    while (!stack.empty() && nums[i] > stack.peek()) {
                        k = stack.peek() > k ? stack.peek() : k;
                        stack.pop();
                    }
                    stack.push(nums[i]);
                }
            }
        }
        return false;
    }
}
