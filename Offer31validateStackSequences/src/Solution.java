import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 18:28
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n=pushed.length;
        Stack<Integer> stack=new Stack<>();
        for (int pushIndex=0,popIndex=0;pushIndex<n;pushIndex++){
            stack.push(pushed[pushIndex]);
            while (popIndex<n&&!stack.empty()&&stack.peek()==popped[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();
    }
}
