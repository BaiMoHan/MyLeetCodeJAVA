package NC93;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 类描述：
 *
 * @ClassName Solution
 * @Description NC93 设计LRU
 * @Author BaiMohan
 * @Date 2021/4/23 16:15
 * @Version 1.0
 */
@SuppressWarnings("all")
public class Solution {
    private int size;
    private int cap;
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode pre;
        DLinkedNode next;

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public DLinkedNode() {
        }
    }
    DLinkedNode head;
    DLinkedNode tail;
    HashMap<Integer,DLinkedNode> map= new HashMap<>();
    public int[] LRU (int[][] operators, int k) {
        // write code here
        List<Integer> list = new LinkedList<Integer>();
        head= new DLinkedNode();
        tail= new DLinkedNode();
        head.next=tail;
        tail.pre=head;
        cap=k;
        for (int i = 0; i < operators.length; i++) {
            if(operators[i][0]==1){
                set(operators[i][1],operators[i][2]);
            }else{
                list.add(get(operators[i][1]));
            }
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    private int get(int key) {
        DLinkedNode node = map.get(key);
        if(node!=null){
            moveToHead(node);
            return node.value;
        }

        return -1;
    }

    private void addToHead(DLinkedNode node) {

        node.next=head.next;
        head.next.pre=node;
        node.pre=head;
        head.next=node;
    }

    private void removeNode(DLinkedNode node) {
        node.next.pre=node.pre;
        node.pre.next=node.next;
    }

    private void set(int key, int value) {
        DLinkedNode node = map.get(key);
        if(node==null){
            DLinkedNode newNode= new DLinkedNode(key,value);
            map.put(key,newNode);
            addToHead(newNode);
            size++;
            if(size>cap){
                DLinkedNode temp =removeTails();
                map.remove(temp.key);
                size--;
            }
        }else{
            moveToHead(node);
            node.value=value;
        }
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTails() {
        DLinkedNode node = tail.pre;
        removeNode(tail.pre);
        return node;
    }
}
