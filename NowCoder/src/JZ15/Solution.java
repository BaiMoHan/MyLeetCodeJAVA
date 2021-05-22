package JZ15;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer15 反转链表
 * @Author BaiMohan
 * @Date 2021/5/22 20:25
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode root = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return root;
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
