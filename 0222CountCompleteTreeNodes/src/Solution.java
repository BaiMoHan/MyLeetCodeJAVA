/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/3 15:26
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

    public int countNodes(TreeNode root) {
        TreeNode l=root,r=root;
        int hl=0,hr=0;
        while (null!=l){
            l=l.left;
            hl++;
        }
        while (null!=r){
            r=r.right;
            hr++;
        }
        if(hl==hr){
            return (int)Math.pow(2,hl)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
