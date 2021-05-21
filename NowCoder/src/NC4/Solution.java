package NC4;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC T4 判断链表中是否有环
 * @Author BaiMohan
 * @Date 2021/5/21 16:33
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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
