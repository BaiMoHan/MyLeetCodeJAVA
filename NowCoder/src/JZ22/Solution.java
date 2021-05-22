package JZ22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 22 从上往下打印二叉树
 * @Author BaiMohan
 * @Date 2021/5/22 16:15
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null) return res;
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                root = q.poll();
                if (root.left != null) q.add(root.left);
                if (root.right != null) q.add(root.right);
                res.add(root.val);
            }
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
