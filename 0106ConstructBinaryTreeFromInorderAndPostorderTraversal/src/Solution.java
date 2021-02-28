/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/2/28 17:22
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return bulid(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode bulid(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd){
        if(inStart>inEnd){
            return null;
        }
        int rootVal=postorder[postEnd];
        int index=-1;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==rootVal){
                index=i;
                break;
            }
        }
        TreeNode root=new TreeNode(rootVal);
        int leftSize=index-inStart;
        root.left=bulid(inorder,inStart,index-1,postorder,postStart,postStart+leftSize-1);
        root.right=bulid(inorder,index+1,inEnd,postorder,postStart+leftSize,postEnd-1);
        return root;
    }
}
