/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0110
 * @Author BaiMohan
 * @Date 2021/4/23 15:22
 * @Version 1.0
 */
@SuppressWarnings("ALL")
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

    public boolean isBalanced(TreeNode root) {
        return recur(root)!=-1;
    }

    public int recur(TreeNode root){
        if(root==null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }
}
