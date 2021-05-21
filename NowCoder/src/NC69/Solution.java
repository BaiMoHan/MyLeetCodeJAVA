package NC69;

import java.util.List;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC T69 链表的倒数第k个节点
 * @Author BaiMohan
 * @Date 2021/5/21 16:38
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode FindKthToTail(ListNode pHead, int k) {
        ListNode p1 = pHead;
        while (p1 != null && k > 0) {
            k--;
            p1 = p1.next;
        }
        if (k > 0) return null;
        ListNode p2 = pHead;
        while (p1 != null) {
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }
}
