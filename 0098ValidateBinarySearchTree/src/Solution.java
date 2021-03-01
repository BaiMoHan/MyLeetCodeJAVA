/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/1 17:24
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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean isValidBST(TreeNode root,long lower,long upper ) {
        if(null==root){
            return true;
        }
        if(root.val<= lower||root.val>=upper){
            return false;
        }
        return isValidBST(root.left,lower, root.val)&&isValidBST(root.right, root.val, upper);
    }
}

