/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description TODO
 * @Author BaiMohan
 * @Date 2021/2/28 15:59
 * @Version 1.0
 */
public class Solution {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if(null==root){
            return null;
        }
        connectionTwoNodes(root.left,root.right);
        return root;
    }
    /*
     * @title connectionTwoNodes
     * @description 辅助函数，连接两个节点
     * @author admin [node1, node2]
     * @updateTime 2021/2/28 16:01 void
     * @throws
     */
    void connectionTwoNodes(Node node1,Node node2){
        if(null==node1||null==node2){
            return;
        }
        node1.next=node2;
        connectionTwoNodes(node1.left,node1.right);
        connectionTwoNodes(node2.left,node2.right);
        connectionTwoNodes(node1.right,node2.left);
    }
}
