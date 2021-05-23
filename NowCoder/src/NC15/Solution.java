package NC15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 15
 * @Author BaiMohan
 * @Date 2021/5/23 14:11
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<Integer>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                root = q.poll();
                level.add(root.val);
                if (root.left != null) q.offer(root.left);
                if (root.right != null) q.offer(root.right);
            }
            res.add(level);
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
