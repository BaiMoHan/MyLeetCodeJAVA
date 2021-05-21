package NC66;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 66 两个链表的第一个公共节点
 * @Author BaiMohan
 * @Date 2021/5/21 17:14
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
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode cur = pHead1;
        int num1 = 0;
        while (cur!=null){
            num1++;
            cur = cur.next;
        }
        int num2 = 0;
        cur = pHead2;
        while (cur!=null){
            num2++;
            cur = cur.next;
        }
        if(num1>num2){
            for (int i = 0; i < num1-num2; i++) {
                pHead1 = pHead1.next;
            }
        }else{
            for (int i = 0; i < num2-num1; i++) {
                pHead2=pHead2.next;
            }
        }
        while (pHead1!=pHead2){
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return pHead1;
    }
}
