package Part3Tree;

/**
 * 类描述：
 *
 * @ClassName PreOrderRecur
 * @Description 先序递归遍历二叉树
 * @Author BaiMohan
 * @Date 2021/4/9 16:58
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class PreOrderRecur {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        Node root=Node.bulidTree(nums);
        PreOrderRecurMethod(root);
    }
    public static void PreOrderRecurMethod(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value+" ");
        PreOrderRecurMethod(root.left);
        PreOrderRecurMethod(root.right);
    }


}
