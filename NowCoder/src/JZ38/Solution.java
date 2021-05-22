package JZ38;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 38 二叉树的深度
 * @Author BaiMohan
 * @Date 2021/5/22 16:09
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
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
