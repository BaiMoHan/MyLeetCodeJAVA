package JZ56;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 56 删除链表中重复的节点
 * @Author BaiMohan
 * @Date 2021/5/22 20:44
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;
        ListNode root = new ListNode(Integer.MAX_VALUE);
        ListNode cur = root;
        root.next = pHead;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int val = cur.next.val;
                while (cur.next != null && cur.next.val == val) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }
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
