import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/3/1 16:09
 * @Version 1.0
 */
public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    HashMap<String, Integer> hashMap = new HashMap<>();
    LinkedList<TreeNode> linkedList = new LinkedList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return linkedList;
    }

    public String traverse(TreeNode root) {
        if (null == root) {
            return "#";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);
        String path = left + "," + right + "," + root.val;
        int fre = hashMap.getOrDefault(path, 0);
        if (1 == fre) {
            linkedList.add(root);
        }
        hashMap.put(path, fre + 1);
        return path;
    }
}
