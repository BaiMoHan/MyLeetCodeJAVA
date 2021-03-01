/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/1 16:34
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

    int res = 0, count = 0;

    public int kthSmallest(TreeNode root, int k) {
        inTraverse(root, k);
        return res;
    }

    public void inTraverse(TreeNode root, int k) {
        if (null == root)
            return;
        inTraverse(root.left, k);
        count++;
        if (count == k) {
            res = root.val;
            return;
        }
        inTraverse(root.right, k);

    }
}
