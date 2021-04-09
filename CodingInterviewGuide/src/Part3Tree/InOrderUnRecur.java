package Part3Tree;

import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName PreOrderRecur
 * @Description 中序非递归遍历二叉树
 * @Author BaiMohan
 * @Date 2021/4/9 16:58
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class InOrderUnRecur {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        Node root=Node.bulidTree(nums);
        InOrderUnRecurMethod(root);
    }
    public static void InOrderUnRecurMethod(Node root){
        if(root==null){
            return;
        }
        System.out.println("中序非递归遍历二叉树:");
        Stack<Node> stack=new Stack<Node>();
        Node cur=root;
        while (cur!=null||!stack.isEmpty()){
             if(cur!=null){
                 stack.push(cur);
                 cur=cur.left;
             }else{
                 cur=stack.pop();
                 System.out.print(cur.value+" ");
                 cur=cur.right;
             }
        }
    }


}
