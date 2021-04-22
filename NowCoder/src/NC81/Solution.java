package NC81;

import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC81
 * @Author BaiMohan
 * @Date 2021/4/22 21:39
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    TreeNode KthNode(TreeNode pRoot, int k) {
        Stack<TreeNode> s = new Stack<>();
        while (pRoot != null || !s.isEmpty()) {
            if (pRoot != null) {
                s.push(pRoot);
                pRoot = pRoot.left;
            } else {
                pRoot = s.pop();
                k--;
                if (k == 0) {
                    return pRoot;
                }
                pRoot = pRoot.right;
            }
        }
        return null;
    }

}
