/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 旋转链表
 * @Author BaiMohan
 * @Date 2021/3/27 23:55
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode p = head;
        int n = 0;
        while (p != null) {
            p = p.next;
            n++;
        }
        k %= n;
        p = head;
        for (int i = 0; i < n - k - 1; i++) {
            p = p.next;
        }
        ListNode q = head;
        while (q.next != null) {
            q = q.next;
        }
        q.next = head;
        head = p.next;
        p.next = null;
        return head;
    }
}
