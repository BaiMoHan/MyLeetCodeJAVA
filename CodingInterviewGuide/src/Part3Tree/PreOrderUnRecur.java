package Part3Tree;

import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName PreOrderRecur
 * @Description 先序非递归遍历二叉树
 * @Author BaiMohan
 * @Date 2021/4/9 16:58
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class PreOrderUnRecur {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        Node root=Node.bulidTree(nums);
        PreOrderUnRecurMethod(root);
    }
    /**
     * @title PreOrderUnRecurMethod
     * @description 中序非递归，申请一个栈，
     * 每次当前节点输出后，先入当前节点的右孩子（不为Null），再入左孩子（不为Null）
     * 这样输出当前根后，下次弹出的时候就是先弹出根的左边
     * @parameters [root]
     * @updateTime 2021/4/9 17:39
     * @return void
     * @throws
     */
    public static void PreOrderUnRecurMethod(Node root){
        if(root==null){
            return;
        }
        System.out.println("先序非递归遍历：");
        Stack<Node> stack=new Stack<Node>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node t=stack.pop();
            System.out.print(t.value+" ");
            if(t.right!=null){
                stack.push(t.right);
            }
            if(t.left!=null){
                stack.push(t.left);
            }
        }
    }


}
