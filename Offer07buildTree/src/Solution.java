import java.util.HashMap;
import java.util.Map;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/22 17:08
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Map<Integer,Integer> indexForInOrders=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexForInOrders.put(inorder[i],i);
        }
        return reConstructBinaryTree(preorder,0,preorder.length-1,0);
    }
    private TreeNode reConstructBinaryTree(int[] pre,int preL,int preR,int inL){
        if(preL>preR)
            return null;
        TreeNode root=new TreeNode(pre[preL]);
        int inIndex=indexForInOrders.get(root.val);
        int leftTreeSize=inIndex-inL;
        root.left=reConstructBinaryTree(pre,preL+1,preL+leftTreeSize,inL);
        root.right=reConstructBinaryTree(pre,preL+leftTreeSize+1,preR,inL+leftTreeSize+1);
        return root;
    }
}
