package NC25;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 25 删除链表中的重复元素
 * @Author BaiMohan
 * @Date 2021/5/21 19:01
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ListNode deleteDuplicates (ListNode head) {
        if(head==null) return null;
        ListNode root = new ListNode(Integer.MAX_VALUE);
        root.next = head;
        ListNode pre = root;
        while (head!=null){
            if(head.val!= pre.val){
                pre.next = head;
                pre = pre.next;
            }
            head=head.next;
        }
        pre.next=null;
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
