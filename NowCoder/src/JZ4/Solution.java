package JZ4;

import java.util.HashMap;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description 牛客剑指Offer4 由前序和中序遍历重建二叉树
 * @Author BaiMohan
 * @Date 2021/5/22 19:18
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length <= 0 || in.length <= 0 || pre.length != in.length) {
            return null;
        }
        for (int i = 0; i < in.length; i++) {
            hashMap.put(in[i],i);
        }
        TreeNode root = buildTree(pre, 0, pre.length - 1, in, 0, in.length - 1);
        return root;
    }

    public TreeNode buildTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(pre[preStart]);
        int index = hashMap.get(pre[preStart]);
        root.left = buildTree(pre, preStart + 1, preStart + index - inStart - 1, in, inStart, index - 1);
        root.right = buildTree(pre, preStart + index - inStart, preEnd, in, index + 1, inEnd);
        return root;
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
