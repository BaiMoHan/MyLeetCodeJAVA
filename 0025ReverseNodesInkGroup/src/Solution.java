/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/4 16:55
 * @Version 1.0
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(null==head){
            return head;
        }
        ListNode a=head,b=head;
        for (int i = 0; i < k; i++) {
            if(null==b){
                return head;
            }
            b=b.next;
        }
        ListNode newHead=reverse(a,b);
        a.next=reverseKGroup(b,k);
        return newHead;
    }
    public ListNode reverse(ListNode a,ListNode b){
        ListNode pre,cur,next;
        pre=null;
        cur=a;
        while(cur!=b){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
