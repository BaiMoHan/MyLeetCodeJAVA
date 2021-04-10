package Part3Tree;

/**
 * 类描述：
 *
 * @ClassName DisplayTree
 * @Description 较为直观的打印二叉树
 * @Author BaiMohan
 * @Date 2021/4/10 15:24
 * @Version 1.0
 */
@SuppressWarnings("all")
public class DisplayTree {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node root = Node.bulidTree(nums);
       DisplayTree displayTree=new DisplayTree();
       displayTree.printTree(root);
    }
    /**
     * @title printTree
     * @description 打印二叉树根控制方法
     * @parameters [head]
     * @updateTime 2021/4/10 15:35
     * @return void
     * @throws
     */
    public void printTree(Node head){
        System.out.println("二叉树为:");
        printInorder(head,0,"H",10);
        System.out.println();
    }
    /**
     * @title printInorder
     * @description 中序遍历打印二叉树，右子树符号提示为”v"，左子树符号提示为“^"
     * @parameters [head, height, to, len]
     * @updateTime 2021/4/10 15:34
     * @return void
     * @throws
     */
    public void printInorder(Node head,int height,String to,int len){
        if(head==null){
            return;
        }
        //先打印右子树，其根节点在下方，采用V字符前后提示
        printInorder(head.right,height+1,"v",len);
        //再输出根
        String val=to+head.value+to;
        int lenM=val.length();
        int lenL=(len-lenM)/2;
        int lenR=len-lenL-lenM;
        val=getSpace(lenL)+val+getSpace(lenR);
        //打印下一层同时要多留出 height*len的前置空格
        System.out.println(getSpace(height*len)+val);
        //在打印左字数
        printInorder(head.left,height+1,"^",len);
    }
    /**
     * @title getSpace
     * @description 生成给定数量的空格组成的字符串
     * @parameters [num]
     * @updateTime 2021/4/10 15:27
     * @return java.lang.String
     * @throws
     */
    public String getSpace(int num){
        String space=" ";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<num;i++){
            sb.append(space);
        }
        return sb.toString();
    }
}
