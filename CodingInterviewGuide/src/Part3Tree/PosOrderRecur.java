package Part3Tree;

/**
 * 类描述：
 *
 * @ClassName PreOrderRecur
 * @Description 后序递归遍历二叉树
 * @Author BaiMohan
 * @Date 2021/4/9 18:31
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class PosOrderRecur {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9};
        Node root=Node.bulidTree(nums);
        PosOrderRecurMethod(root);
    }
    public static void PosOrderRecurMethod(Node root){
        if(root==null){
            return;
        }

        PosOrderRecurMethod(root.left);
        PosOrderRecurMethod(root.right);
        System.out.print(root.value+" ");
    }


}
