/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0783
 * @Author BaiMohan
 * @Date 2021/4/13 23:38
 * @Version 1.0
 */
@SuppressWarnings("all")
class Solution {
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
    boolean flag = true;
    int last=0;
    int res = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {


        inorder(root);
        return res;

    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(flag){
            flag=false;
            last=root.val;
        }else{

            res=Math.min(res,root.val-last);
            last=root.val;
        }
        inorder(root.right);
    }
}
