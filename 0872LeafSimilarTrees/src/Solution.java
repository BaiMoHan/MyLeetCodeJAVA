import java.util.ArrayList;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description leetcode 0812
 * @Author BaiMohan
 * @Date 2021/5/10 23:36
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        dfs(root1,l1);
        dfs(root2,l2);
        if(l1.size()!=l2.size()) return false;
        for (int i = 0; i < l1.size(); i++) {
            if(!l1.get(i).equals(l2.get(i))) return false;
        }
        return true;
    }

    private void dfs(TreeNode root, ArrayList<Integer> l) {
        if(root == null)return;
        if(root.right == null && root.left ==null) l.add(root.val);
        dfs(root.left,l);
        dfs(root.right,l);
       }
}
