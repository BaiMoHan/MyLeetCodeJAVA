import java.util.HashMap;

/**
 * 类描述：
 *
 * @ClassName LRUCache
 * @Description leetcode 0146
 * @Author BaiMohan
 * @Date 2021/4/23 15:35
 * @Version 1.0
 */
@SuppressWarnings("all")
public class LRUCache {

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
    int size; //元素个数
    int cap;
    HashMap<Integer,DLinkedNode> map = new HashMap<>();
    DLinkedNode head;
    DLinkedNode tail;
    public LRUCache(int capacity) {
        cap = capacity;
        size=0;
        head=new DLinkedNode();
        tail=new DLinkedNode();
        head.next=tail;
        tail.pre=head;
    }


    public int get(int key) {
        DLinkedNode node = map.get(key);
        if(node==null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void addToHead(DLinkedNode node) {
        node.next=head.next;
        head.next.pre=node;
        node.pre=head;
        head.next=node;
    }

    private void removeNode(DLinkedNode node) {
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }

    public void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if(node==null){
            DLinkedNode newNode = new DLinkedNode(key,value);
            addToHead(newNode);
            map.put(key,newNode);
            size++;
            if(size>cap){
                DLinkedNode temp=removeTail();
                map.remove(temp.key);
                size--;
            }
        }else{
            node.value=value;
            moveToHead(node);
        }
    }

    private DLinkedNode removeTail() {
        DLinkedNode node = tail.pre;
        removeNode(node);
        return node;
    }
}
