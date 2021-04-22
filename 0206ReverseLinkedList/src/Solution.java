/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0206
 * @Author BaiMohan
 * @Date 2021/3/3 15:35
 * @Version 2.0
 * 增加了非递归的写法
 */
@SuppressWarnings("ALL")
public class Solution {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        if(null==head||head.next==null){
            return head;
        }
        ListNode last=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }

    public ListNode reverseListUnrecur(ListNode head){
          if(head == null){
              return null;
          }
          ListNode root = new ListNode(-1);
          root.next =  head;
          ListNode pre = root;
          ListNode cur = head;
          ListNode next;
          while (cur!=null){
              next = cur.next;
              cur.next = pre;
              pre = cur;
              cur = next;
          }
          head.next =  null;
          return pre;
    }
}
