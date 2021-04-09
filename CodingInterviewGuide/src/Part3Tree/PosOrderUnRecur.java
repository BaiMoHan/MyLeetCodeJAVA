package Part3Tree;

import java.util.Stack;

/**
 * 类描述：
 *
 * @ClassName PreOrderRecur
 * @Description 后序递归遍历二叉树
 * @Author BaiMohan
 * @Date 2021/4/9 18:34
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class PosOrderUnRecur {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        Node root=Node.bulidTree(nums);
        PosOrderUnRecurMethodTwoStack(root);
        System.out.println();
        PosOrderUnRecurMethodOneStack(root);
    }
    /**
     * @title PosOrderUnRecurMethodTwoStack
     * @description 后序非递归遍历,使用两个栈，相当于一个栈是正常根 右 左的弹出顺序，
     * 依次放到另一个栈再弹出就是左 右 根的后序顺序，第二个栈起的作用就是倒序一下，第一个栈其实就是先序非递归
     * @parameters [root]
     * @updateTime 2021/4/9 18:41
     * @return void
     * @throws
     */
    public static void PosOrderUnRecurMethodTwoStack(Node root){
        if(root==null){
            return;
        }
        System.out.println("后序非递归遍历，使用两个栈");
        Stack<Node> s1=new Stack<Node>();
        Stack<Node> s2=new Stack<Node>();
        s1.push(root);
        while (!s1.isEmpty()){
            Node cur=s1.pop();
            s2.push(cur);
            if(cur.left!=null){
                s1.push(cur.left);
            }
            if(cur.right!=null){
                s1.push(cur.right);
            }
        }
        while (!s2.empty()){
            System.out.print(s2.pop().value+" ");
        }
    }

    /**
     * @title PosOrderUnRecurMethodOneStack
     * @description 只使用一个栈和两个引用变量h c实现二叉树后序非递归遍历
     *  h代表最近一次弹出并打印的节点
     *  c代表栈顶节点
     *  如果c的左孩子不为null，且h不为c的左右孩子,说明c的左孩子还没打印，那么c的左孩子压栈
     *  否则如果c的右孩子不为null，且h不为c的右孩子,说明c的右孩子还没打印，那么c的左孩子压栈
     *  否则 说明 c的双孩子都打印了，把C出栈打印
     * @parameters [root]
     * @updateTime 2021/4/9 19:01
     * @return void
     * @throws
     */
    public static void PosOrderUnRecurMethodOneStack(Node root){
        System.out.println("后序非递归遍历，只使用一个栈：");
        Stack<Node> s=new Stack<Node>();
        s.push(root);
        Node h=root;
        Node c=null;
        while (!s.empty()){
            c=s.peek();
            if(c.left!=null&&c.left!=h&&c.right!=h){
                s.push(c.left);
            }else if(c.right!=null&&c.right!=h){
                s.push(c.right);
            }else {
                System.out.print(s.pop().value+" ");
                h=c;
            }
        }
    }


}
