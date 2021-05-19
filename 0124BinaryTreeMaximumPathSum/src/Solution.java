/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0124
 * @Author BaiMohan
 * @Date 2021/5/19 9:14
 * @Version 1.0
 */
@SuppressWarnings("ALL")
class Solution {
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxRecur(root);
        return res;
    }
    public int maxRecur(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(maxRecur(root.left),0);
        int right = Math.max(maxRecur(root.right),0);
        int num = root.val + left + right;
        res = Math.max(res,num);
        return root.val+Math.max(left,right);
    }
       public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
}
