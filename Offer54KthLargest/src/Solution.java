/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 剑指offer 54
 * @Author BaiMohan
 * @Date 2021/4/22 21:34
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

    private int count = 0;

    public int res;

    public int kthLargest(TreeNode root, int k) {
        count = k;
        inOreder(root);
        return res;
    }
    public void inOreder(TreeNode root){
        if(root == null){
            return;
        }
        inOreder(root.right);
        if(--count == 0){
            res = root.val;
            return;
        }
        inOreder(root.left);
    }
}
