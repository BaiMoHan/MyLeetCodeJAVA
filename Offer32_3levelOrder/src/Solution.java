import java.util.*;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/22 20:39
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root!=null){
            q.add(root);
        }
        boolean flag=false;
        while (!q.isEmpty()){
            List<Integer> t=new ArrayList<>();
/*            for (int i = 0; i < q.size(); i++) {
                TreeNode node=q.poll();
                t.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }*/
            for (int i = q.size(); i >0 ; i--) {
                TreeNode node=q.poll();
                t.add(node.val);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            if (flag){
                Collections.reverse(t);
            }
            lists.add(t);
            flag=!flag;
        }
        return lists;
    }
}
