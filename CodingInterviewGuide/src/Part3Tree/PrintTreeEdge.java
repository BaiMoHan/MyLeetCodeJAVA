package Part3Tree;

/**
 * 类描述：
 *
 * @ClassName PrintTreeEdge
 * @Description  打印二叉树的边界节点
 * @Author BaiMohan
 * @Date 2021/4/9 19:06
 * @Version 1.0
 */
@SuppressWarnings("all")
public class PrintTreeEdge {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node root = Node.bulidTree(nums);
        PrintTreeEdge printTreeEdge = new PrintTreeEdge();
        printTreeEdge.printEdge1(root);
        System.out.println();
        printTreeEdge.printEdge2(root);
    }

    /**
     * @return void
     * @throws
     * @title printEdge1
     * @description 打印二叉树的边界节点
     * 第一种边界节点的定义：
     * 1.头节点为边界节点
     * 2.叶节点为边界节点
     * 3.如果节点其所在的层中是最左或者最有，也是边界节点
     * @parameters [head]
     * @updateTime 2021/4/9 19:21
     */
    public void printEdge1(Node head) {
        if (head == null) {
            return;
        }
        int height = getHeight(head, 0);
        Node[][] edgeMap = new Node[height][2];
        setEdgeMap(head, 0, edgeMap);
        //打印左边界
        for (int i = 0; i != edgeMap.length; i++) {
            System.out.print(edgeMap[i][0].value + " ");
        }
        //打印既不是左边界也不是右边界的叶子节点
        printLeafNotInMap(head, 0, edgeMap);
        // 打印右边界，但不是左边界的节点
        for (int i = edgeMap.length - 1; i >= 0; i--) {
            if (edgeMap[i][0] != edgeMap[i][1]) {
                System.out.print(edgeMap[i][1].value + " ");
            }
        }
        System.out.println();
    }

    /**
     * @return void
     * @throws
     * @title getHeight
     * @description 获取二叉树的高度
     * @parameters [h, l]
     * @updateTime 2021/4/9 19:23
     */
    public int getHeight(Node h, int l) {
        if (h == null) {
            return l;
        }
        return Math.max(getHeight(h.left, l + 1), getHeight(h.right, l + 1));
    }

    /**
     * @return void
     * @throws
     * @title setEdgeMap
     * @description 递归寻找最左边和最右边的边界节点
     * @parameters [h, l, edgeMap]
     * @updateTime 2021/4/10 14:32
     */
    public void setEdgeMap(Node h, int l, Node[][] edgeMap) {
        if (h == null) {
            return;
        }
        edgeMap[l][0] = edgeMap[l][0] == null ? h : edgeMap[l][0];
        edgeMap[l][1] = h;
        setEdgeMap(h.left, l + 1, edgeMap);
        setEdgeMap(h.right, l + 1, edgeMap);
    }

    /**
     * @return void
     * @throws
     * @title printLeafNotInMap
     * @description 打印既不是左边界也不是右边界的叶子节点
     * @parameters [h, l, m]
     * @updateTime 2021/4/10 14:40
     */

    public void printLeafNotInMap(Node h, int l, Node[][] m) {
        if (h == null) {
            return;
        }
        if (h.left == null && h.right == null && h != m[l][0] && h != m[l][1]) {
            System.out.print(h.value + " ");
        }
        printLeafNotInMap(h.left, l + 1, m);
        printLeafNotInMap(h.right, l + 1, m);
    }

    /**
     * @return void
     * @throws
     * @title printEdge2
     * @description 按第二种标准打印边界节点
     * 1.头节点为边界节点
     * 2.叶节点为边界节点
     * 3.树左边界延申下去的路径为边界节点
     * 4.树右边界延申下去的路径为边界节点
     * @parameters [head]
     * @updateTime 2021/4/10 14:55
     */
    public void printEdge2(Node head) {
        if(head == null){
            return;
        }
        System.out.print(head.value+" ");
        if(head.left!=null&&head.right!=null){
            printLefEdge(head.left,true);
            printRightEdge(head.right,true);
        }else {
            printEdge2(head.left!=null?head.left:head.right);
        }
        System.out.println();
    }

    /**
     * @return void
     * @throws
     * @title printLefEdge
     * @description 打印左边界延申下去的节点
     * @parameters [h, print]
     * @updateTime 2021/4/10 15:01
     */
    public void printLefEdge(Node h, boolean print) {
        if (h == null) {
            return;
        }
        if (print || (h.left == null && h.right == null)) {
            System.out.print(h.value + " ");
        }
        printLefEdge(h.left, print);
        printLefEdge(h.right, print && h.left == null ? true : false);
    }

    /**
     * @return void
     * @throws
     * @title printRightEdge
     * @description 打印右边届延申的节点，注意是逆时针顺序
     * @parameters [h, print]
     * @updateTime 2021/4/10 15:05
     */
    public void printRightEdge(Node h, boolean print) {
        if (h == null) {
            return;
        }
        printRightEdge(h.left, print && h.right == null ? true : false);
        printRightEdge(h.right, print);
        if (print || (h.left == null && h.right == null)) {
            System.out.print(h.value + " ");
        }
    }
}
