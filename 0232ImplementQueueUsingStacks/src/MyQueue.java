import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName MyQueue
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/5 8:30
 * @Version 1.0
 */
public class MyQueue {
    public Stack<Integer> stackPush;
    public Stack<Integer> stackPop;
    /** Initialize your data structure here. */
    public MyQueue() {
        stackPush=new Stack<Integer>();
        stackPop=new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackPush.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stackPush.empty()&&stackPop.empty()){
            throw new RuntimeException("Queue is empty");
        }
        pushToPop();
        return stackPop.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(stackPush.empty()&&stackPop.empty()){
            throw new RuntimeException("Queue is empty");
        }
        pushToPop();
        return stackPop.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackPop.empty()&& stackPush.empty();
    }

    public void pushToPop(){
        if(stackPop.empty()){
            while (!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
    }
}
