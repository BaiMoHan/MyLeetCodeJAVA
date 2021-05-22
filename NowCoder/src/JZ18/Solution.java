package JZ18;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer 18 二叉树的镜像
 * @Author BaiMohan
 * @Date 2021/5/22 15:17
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Solution {
    public TreeNode Mirror (TreeNode pRoot) {
        if(pRoot==null) return pRoot;
        /*pRoot.right = Mirror(pRoot.left);
        pRoot.left = Mirror(pRoot.right); 会混乱，导致right始终没有交换
        */
        TreeNode left = Mirror(pRoot.right);
        TreeNode right = Mirror(pRoot.left);
        pRoot.left = left;
        pRoot.right = right;
        return pRoot;
    }
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
}
