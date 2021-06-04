/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0160
 * @Author BaiMohan
 * @Date 2021/6/17 17:26
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode pa = headA, pb = headB;
        while (pa != pb) {
            pa = pa == null ? headB : pa.next;
            pb = pb == null ? headA : pb.next;
        }
        return pa;
    }
}
