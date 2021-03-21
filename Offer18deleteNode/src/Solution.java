/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/21 21:16
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
    public ListNode deleteNode(ListNode head, int val) {
        ListNode cur=head;
        if(head!=null&&head.val==val){
            head=head.next;
            return head;
        }
        while (cur!=null&&cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }
            cur=cur.next;
        }
        return head;
    }
}
