package Part3Tree;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 类描述：
 *
 * @ClassName Node
 * @Description 二叉树树节点结构
 * @Author BaiMohan
 * @Date 2021/4/9 16:56
 * @Version 1.0
 */
@SuppressWarnings("ALL")
public class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value){
        this.value=value;
    }

    public static Node bulidTree(int[] nums){
        if(nums==null||nums.length<=0){
            System.out.println("建树错误！");
            return null;
        }
        Node root = new Node(nums[0]);
        Node cur=root;
        int index=1;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(cur);
        while (!queue.isEmpty()){
            Node p= queue.poll();
            if(index>=nums.length){
                break;
            }
            p.left=new Node(nums[index++]);
            if(index>=nums.length){
                break;
            }
            p.right=new Node(nums[index++]);
            queue.add(p.left);
            queue.add(p.right);
        }
        return root;
    }
}
