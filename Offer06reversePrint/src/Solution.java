import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 19:56
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }

        int n = 0;
        ListNode cur = head;
        while (cur != null) {
            n++;
            cur = cur.next;
        }
        int[] res = new int[n];
        cur = head;
        for (int i = 0; i < n; i++) {
            res[n - i - 1] = cur.val;
            cur = cur.next;
        }
        return res;
    }

    public ArrayList<Integer> printListFromTail(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTail(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    public ArrayList<Integer> printListFromTailByNewHead(ListNode listNode) {
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }
    public ArrayList<Integer> printListFromTailByStack(ListNode listNode) {
        Stack<Integer> stack=new Stack<>();
        while (listNode!=null){
            stack.add(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> ret=new ArrayList<>();
        while(!stack.empty()){
            ret.add(stack.pop());
        }
        return ret;
    }
}
