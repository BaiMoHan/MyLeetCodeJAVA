/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/2/28 17:02
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return bulid(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode bulid(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd){
        if(preStart>preEnd){
            return null;
        }
        int rootVal=preorder[preStart];
        int index=1;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==rootVal){
                index=i;
                break;
            }
        }
        TreeNode root=new TreeNode(rootVal);
        int leftSize=index-inStart;
        root.left=bulid(preorder,preStart+1,preStart+leftSize,inorder,inStart,index-1);
        root.right=bulid(preorder,preStart+leftSize+1,preEnd,inorder,index+1,inEnd);
        return root;

    }
}
