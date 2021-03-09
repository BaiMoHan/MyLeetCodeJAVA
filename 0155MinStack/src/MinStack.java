import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/9 20:46
 * @Version 1.0
 */
public class MinStack {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }
    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stackData = new Stack<Integer>();
        stackMin = new Stack<Integer>();
    }

    public void push(int x) {
        if(stackData.isEmpty()){
            stackMin.push(x);
        }else if(x<=stackMin.peek()){
            stackMin.push(x);
        }
        stackData.push(x);

    }

    public void pop() {
        if(stackData.isEmpty()){
            throw new RuntimeException("Stack empty");
        }
        int value=stackData.pop();
        if(value==stackMin.peek()){
            stackMin.pop();
        }
    }

    public int top() {
        return stackData.peek();
    }

    public int getMin() {
        if(stackMin.isEmpty()){
            throw new RuntimeException("stack empty");
        }
        return stackMin.peek();
    }
}
