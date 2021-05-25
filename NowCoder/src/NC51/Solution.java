package NC51;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 51
 * @Author BaiMohan
 * @Date 2021/5/25 9:03
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.size() <= 0) return null;
        ListNode root = new ListNode(Integer.MAX_VALUE);
        ListNode cur = root;
        PriorityQueue<ListNode> q = new PriorityQueue<>(lists.size(), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode list : lists) {
            if (list != null)
                q.add(list);
        }
        while (!q.isEmpty()) {
            cur.next = q.poll();
            cur = cur.next;
            if (cur.next != null) {
                q.add(cur.next);
            }
        }
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
