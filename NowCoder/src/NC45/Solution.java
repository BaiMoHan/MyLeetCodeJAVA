package NC45;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC 45
 * @Author BaiMohan
 * @Date 2021/5/24 10:06
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public int[][] threeOrders(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();
        preOrder(root, pre);
        inOrder(root, in);
        postOrder(root, post);
        int n = pre.size();
        int[][] res = new int[3][n];
        for (int i = 0; i < n; i++) {
            res[0][i] = pre.get(i);
            res[1][i] = in.get(i);
            res[2][i] = post.get(i);
        }
        return res;
    }

    private void postOrder(TreeNode root, List<Integer> post) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            TreeNode top = null;
            while (!stack.isEmpty()) {
                top = stack.peek();
                if (top.left != null && root != top.left && root != top.right) {
                    stack.push(top.left);
                } else if (top.right != null && root != top.right) {
                    stack.push(top.right);
                } else {
                    post.add(top.val);
                    stack.pop();
                    root = top;
                }
            }
        }
        return;
    }

    private void inOrder(TreeNode root, List<Integer> in) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                in.add(root.val);
                root = root.right;
            }
        }
        return;
    }

    private void preOrder(TreeNode root, List<Integer> pre) {
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                pre.add(root.val);
                if (root.right != null) stack.push(root.right);
                if (root.left != null) stack.push(root.left);
            }
        }
        return;
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
