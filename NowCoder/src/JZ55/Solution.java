package JZ55;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 55 链表环的入口节点
 * @Author BaiMohan
 * @Date 2021/5/22 20:42
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = meetingNode(head);
        if (fast == null) {
            return null;
        }
        ListNode slow = head;
        // 先判断是否存在环
        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public ListNode meetingNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
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
