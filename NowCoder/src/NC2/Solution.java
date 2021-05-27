package NC2;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 2
 * @Author BaiMohan
 * @Date 2021/5/27 14:23
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pHead = slow.next;
        ListNode p2 = reverseList(pHead);
        ListNode p1 = head;
        while (p1 != null && p2 != null) {
            ListNode p1Next = p1.next;
            ListNode p2Next = p2.next;
            p1.next = p2;
            p1 = p1Next;
            p2.next = p1;
            p2 = p2Next;
        }
    }

    private ListNode reverseList(ListNode pHead) {
        ListNode pre = null;
        ListNode cur = pHead;
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
