package NC3;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客 T3 判断链表的环
 * @Author BaiMohan
 * @Date 2021/5/21 16:08
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
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fast = meetingNode(head);
        if(fast == null){
            return null;
        }
        ListNode slow = head;
        // 先判断是否存在环
        while (fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow ;
    }

    public ListNode meetingNode(ListNode head){
           ListNode slow = head;
           ListNode fast = head;
           while (fast!=null&&fast.next!=null){
               slow = slow.next;
               fast = fast.next.next;
               if(slow == fast){
                   return slow;
               }
           }
           return null;
    }
}
