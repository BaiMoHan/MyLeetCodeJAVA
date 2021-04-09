package Part3Tree;

/**
 * 类描述：
 *
 * @ClassName PreOrderRecur
 * @Description 中序递归遍历二叉树
 * @Author BaiMohan
 * @Date 2021/4/9 16:58
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class InOrderRecur {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        Node root=Node.bulidTree(nums);
        InOrderRecurMethod(root);
    }
    public static void InOrderRecurMethod(Node root){
        if(root==null){
            return;
        }
        InOrderRecurMethod(root.left);
        System.out.print(root.value+" ");
        InOrderRecurMethod(root.right);
    }


}
