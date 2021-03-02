/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/2 15:34
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(null==root){
            return new TreeNode(val);
        }
        if(val< root.val){
            root.left=insertIntoBST(root.left,val);
        }else if(val> root.val){
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }

}
