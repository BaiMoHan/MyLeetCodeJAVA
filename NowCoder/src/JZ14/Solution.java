package JZ14;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer14 链表中倒数第k个节点
 * @Author BaiMohan
 * @Date 2021/5/22 20:22
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
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

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
