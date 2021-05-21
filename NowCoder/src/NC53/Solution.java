package NC53;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 53 删除链表中倒数第n个节点
 * @Author BaiMohan
 * @Date 2021/5/21 18:32
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode removeNthFromEnd (ListNode head, int n) {
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode p1 = head;
        // 题目保证n合法
        for (int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        ListNode p2 = root;
        while (p1!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return root.next.next==null?null:root.next;
    }
}
