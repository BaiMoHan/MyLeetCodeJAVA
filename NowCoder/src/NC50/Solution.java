package NC50;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 50
 * @Author BaiMohan
 * @Date 2021/5/24 16:49
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 2) return head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode start = null;
        ListNode next = null;
        int count = 1;
        while (cur != null) {
            next = cur.next;
            if (count == k) {
                start = pre == null ? head : pre.next;
                head = pre == null ? cur : head;
                reverseLinkList(pre, start, cur, next);
                pre = start;
                count = 0;
            }
            // 翻转后不能cur=cur.next
            cur = next;
            count++;
        }
        return head;
    }

    public void reverseLinkList(ListNode left, ListNode start, ListNode end, ListNode right) {
        ListNode pre = start;
        ListNode cur = start.next;
        ListNode next = null;
        while (cur != right) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        if (left != null) {
            left.next = end;
        }
        start.next = right;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
