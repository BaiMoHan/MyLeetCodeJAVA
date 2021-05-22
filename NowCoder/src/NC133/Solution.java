package NC133;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 133 链表的奇偶重排
 * @Author BaiMohan
 * @Date 2021/5/22 8:54
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
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
