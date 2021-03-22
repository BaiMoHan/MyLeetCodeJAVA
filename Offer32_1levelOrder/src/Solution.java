import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/22 19:08
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

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        ArrayList ret = new ArrayList();
        while (!queue.isEmpty()) {
            TreeNode t = queue.poll();
            if (t != null) {
                ret.add(t.val);
            }
            if (t.left != null)
                queue.add(t.left);
            if (t.right != null)
                queue.add(t.right);
        }
        int[] res = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            res[i] = (int) ret.get(i);
        }
        return res;
    }
}
