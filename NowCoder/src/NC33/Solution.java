package NC33;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 33 合并有序链表
 * @Author BaiMohan
 * @Date 2021/5/21 17:00
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
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (l1!=null||l2!=null){
            if(l1==null){
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
            else if(l2==null){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }else{
                if(l1.val> l2.val){
                    cur.next = l2;
                    l2 = l2.next;
                    cur = cur.next;
                }else{
                    cur.next = l1;
                    l1 = l1.next;
                    cur = cur.next;
                }
            }
        }
        return head.next;
    }
}
