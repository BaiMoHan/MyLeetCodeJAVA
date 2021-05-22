package NC40;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 40 链表相加
 * @Author BaiMohan
 * @Date 2021/5/21 19:46
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ListNode addInList(ListNode head1, ListNode head2) {
        head1 = reverseLinkList(head1);
        head2 = reverseLinkList(head2);
        ListNode root = new ListNode(Integer.MAX_VALUE);
        ListNode cur = root;
        int num = 0;
        while (head1 != null || head2 != null || num != 0) {
            int sum = 0;
            int a = head1 == null ? 0 : head1.val;
            int b = head2 == null ? 0 : head2.val;
            sum = a + b + num;
            num = sum / 10;
            sum %= 10;
            cur.next = new ListNode(sum);
            cur = cur.next;
            if (head1 != null) head1 = head1.next;
            if (head2 != null) head2 = head2.next;
        }
        root = reverseLinkList(root.next);
        return root;
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
