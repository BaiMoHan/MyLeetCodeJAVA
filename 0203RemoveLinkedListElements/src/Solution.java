/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0203
 * @Author BaiMohan
 * @Date 2021/6/17 19:37
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode root = new ListNode(-1);
        ListNode p = root;
        while (head != null) {
            if (head.val != val) {
                p.next = head;
                p = p.next;
            }
            head = head.next;
        }
        p.next = null;
        return root.next;
    }
}
