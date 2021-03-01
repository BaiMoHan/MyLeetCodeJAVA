/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/1 17:09
 * @Version 1.0
 */
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode bstToGst(TreeNode root) {
        inTraverse(root);
        return root;
    }

    int sum = 0;

    public void inTraverse(TreeNode root) {
        if (null == root) {
            return;
        }
        inTraverse(root.right);
        sum += root.val;
        root.val = sum;
        inTraverse(root.left);
    }
}
