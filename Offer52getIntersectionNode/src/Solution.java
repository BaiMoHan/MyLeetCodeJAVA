/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/22 14:46
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA!=headB){
            headA=headA==null?headB:headA.next;
            headB=headB==null?headA:headB.next;
        }
        return headA;
    }
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode cur=headA;
        int k1=0,k2=0;
        while (cur!=null){
            cur=cur.next;
            k1++;
        }
        cur=headB;
        while (cur!=null){
            cur=cur.next;
            k2++;
        }
        if(k1>k2){
            int n=k1-k2;
            while (n>0){
                headA=headA.next;
                n--;
            }
        }else if(k2>k1){
            int n=k2-k1;
            while (n>0){
                headB=headB.next;
                n--;
            }
        }
        while (headA!=null&&headB!=null){
            if(headA== headB){//注意此处不能是headA.val==headB.val
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
