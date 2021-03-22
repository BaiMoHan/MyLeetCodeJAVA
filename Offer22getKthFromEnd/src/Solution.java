/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/22 14:08
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode cur=head;
        while (cur!=null&&k>0){
            cur=cur.next;
            k--;
        }
        if(k<0){
            return null;
        }
        while (cur!=null){
            head=head.next;
            cur=cur.next;
        }
        return head;
    }
}
