package NC102;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 102
 * @Author BaiMohan
 * @Date 2021/5/25 11:02
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        if (root == null) return Integer.MIN_VALUE;
        if (root.val == o1 || root.val == o2) return root.val;
        int left = lowestCommonAncestor(root.left, o1, o2);
        int right = lowestCommonAncestor(root.right, o1, o2);
        if (left == Integer.MIN_VALUE && right == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (left == Integer.MIN_VALUE) return right;
        if (right == Integer.MIN_VALUE) return left;
        return root.val;
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
