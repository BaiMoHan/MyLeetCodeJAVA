/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/2 15:44
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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(null==root){
            return null;
        }
        if(key== root.val){
            if(null==root.left){
                return root.right;
            }
            if(null==root.right){
                return root.left;
            }
            TreeNode minNode=getMin(root.right);
            root.val=minNode.val;
            root.right=deleteNode(root.right,minNode.val);
        }else if(key> root.val){
            root.right=deleteNode(root.right,key);
        }else if(key<root.val){
            root.left=deleteNode(root.left,key);
        }
        return root;

    }
    TreeNode getMin(TreeNode node){
        while (node.left!=null){
            node=node.left;
        }
        return node;
    }
}
