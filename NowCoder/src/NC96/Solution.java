package NC96;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 96 判断是否为回文链表
 * @Author BaiMohan
 * @Date 2021/5/22 8:36
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public boolean isPail(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = null;
        fast = reverseLinkList(slow.next);
        slow = head;
        while (fast != null) {
            if (slow.val != fast.val) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverseLinkList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
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
