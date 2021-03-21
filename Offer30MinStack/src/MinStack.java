import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName MinStack
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 18:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> stackMin;
    public MinStack() {
        stack=new Stack<Integer>();
        stackMin=new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if (stackMin.empty()){
            stackMin.push(x);
        }else {
            if(x<=stackMin.peek()){
               stackMin.push(x);
            }
        }
    }

    public void pop() {
        int val=stack.pop();
        if(val<=stackMin.peek()){
            stackMin.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackMin.peek();
    }
}
