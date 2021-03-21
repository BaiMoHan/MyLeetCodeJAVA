import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 17:09
 * @Version 1.0
 */
@SuppressWarnings("all")
public class CQueue {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public CQueue() {
        in = new Stack<Integer>();
        out = new Stack<Integer>();
    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        if (out.empty()) {
            while (!in.empty()) {
                out.push(in.pop());
            }
        }
        if (out.empty()) {
            return -1;
        } else {
            return out.pop();
        }
    }
}
