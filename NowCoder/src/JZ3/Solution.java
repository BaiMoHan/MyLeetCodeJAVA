package JZ3;

import java.util.ArrayList;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指 3
 * @Author BaiMohan
 * @Date 2021/5/16 15:36
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode!=null){
            printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }
}
