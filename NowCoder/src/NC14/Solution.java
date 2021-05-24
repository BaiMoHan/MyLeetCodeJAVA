package NC14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 14
 * @Author BaiMohan
 * @Date 2021/5/23 14:39
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        boolean kind = false;
        while (!q.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                root = q.poll();
                if (kind == false) {
                    level.add(root.val);
                } else {
                    level.add(0, root.val);
                }
                if (root.left != null) q.offer(root.left);
                if (root.right != null) q.offer(root.right);
            }
            res.add(level);
            kind = !kind;
        }
        return res;
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}
