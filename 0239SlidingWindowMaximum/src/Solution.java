import java.util.LinkedList;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/9 21:47
 * @Version 1.0
 */
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k < 1 || nums.length < k){
            return null;
        }
        LinkedList<Integer> qmax=new LinkedList<Integer>();
        int[] res=new int[nums.length-k+1];
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            while (!qmax.isEmpty()&&nums[qmax.peekLast()]<=nums[i]){
                qmax.pollLast();
            }
            qmax.addLast(i);
            if(qmax.peekFirst()==i-k){
                qmax.pollFirst();
            }
            if(i>=k-1){
                res[index++]=nums[qmax.peekFirst()];
            }
        }
        return res;

    }
}
