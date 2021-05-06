package NC78;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 78 反转链表
 * @Author BaiMohan
 * @Date 2021/5/6 20:47
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {

        ListNode cur = head;
        ListNode next = null;
        ListNode pre = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode ReverseListRecur(ListNode head) {
        if(head ==  null||head.next==null) return head;
        ListNode root = ReverseListRecur(head.next);
        head.next.next = head;
        head.next = null;
        return root;
    }

}
