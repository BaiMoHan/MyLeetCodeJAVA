import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/22 22:14
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean verifyPostorder(int[] postorder) {
        Stack<Integer> stack=new Stack<>();
        int root=Integer.MAX_VALUE;
        for (int i = postorder.length-1; i >= 0; i--) {
            if(postorder[i]>root){
                return false;
            }
            while (!stack.isEmpty()&&stack.peek()>postorder[i]){
                root=stack.pop();
            }
            stack.add(postorder[i]);
        }
        return true;
    }
}
