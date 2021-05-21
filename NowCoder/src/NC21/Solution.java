package NC21;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 21 反转指定区间内的链表
 * @Author BaiMohan
 * @Date 2021/5/21 19:13
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode root = new ListNode(Integer.MAX_VALUE);
        root.next = head;
        ListNode start = root;
        for (int i = 0; i < m-1; i++) {
            start = start.next;
        }
        ListNode end = head;
        for (int i = 0; i < n; i++) {
            end = end.next;
        }
        ListNode pre = null;
        ListNode cur = start.next;
        ListNode next = null;
        while (cur!=end){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next.next = end;
        start.next = pre;
        return root.next;
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
