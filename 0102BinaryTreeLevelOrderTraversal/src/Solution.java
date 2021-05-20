import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0102
 * @Author BaiMohan
 * @Date 2021/5/20 18:44
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
       public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while (!q.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            TreeNode node = null;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                node = q.poll();
                level.add(node.val);
                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right);
            }
            res.add(level);
        }
        return res;
    }
}
