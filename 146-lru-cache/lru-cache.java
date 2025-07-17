import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node {
        int key, value;
        Node prev, next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    int capacity;
    Map<Integer, Node> cache;
    Node head, tail;  // Dummy nodes

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();
        
        // Initialize dummy head and tail
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        
        Node node = cache.get(key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
        // node.next
        return node.value;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
        } else {
            if (cache.size() >= capacity) {
                Node lru = tail.prev;
                // removeNode(lru);       // Remove LRU
                lru.prev.next = tail;
                tail.prev = lru.prev;
                cache.remove(lru.key); // Remove from map
            }
            Node newNode = new Node(key, value);
            // addToHead(newNode);
            newNode.next = head.next;
            newNode.prev = head;
            head.next.prev = newNode;
            head.next = newNode;
            cache.put(key, newNode);
        }
    }
    
    // private void addToHead(Node node) {
    //     // Insert between head and first real node
    //     node.prev = head;
    //     node.next = head.next;
    //     head.next.prev = node;
    //     head.next = node;
    // }
    
    // private void removeNode(Node node) {
    //     // Bypass node
    //     node.prev.next = node.next;
    //     node.next.prev = node.prev;
    // }
}


// class LRUCache {
//     Map<Integer, Integer> mp;
//     int lru ;
//     int c ;
//     Queue<Integer> q;

//     public LRUCache(int capacity) {
//     //     mp = new HashMap<>(capacity);
//     //     c = capacity;
//     //     q = new LinkedList<>();
//     // }
    
//     // public int get(int key) {
//     //     if(!mp.containsKey(key)){
//     //         return -1;
//     //     }

//     //     q.remove(key);
//     //     q.offer(key);


//     //     return mp.get(key);
        
//     // }
    
//     // public void put(int key, int value) {
//     //     if(mp.containsKey(key)){
//     //         mp.put(key, value);
//     //         q.remove(key);
//     //         q.offer(key);
//     //     }
//     //     else if(mp.size()>=c){
//     //         mp.remove(q.poll());
//     //         // q.poll();
//     //         mp.put(key, value);
//     //         q.offer(key);
//     //     }
//     //     else{
//     //         mp.put(key, value);
//     //         q.offer(key);
//     //     }

        

        
//         class DLinkedNode {
//         int key;
//         int value;
//         DLinkedNode prev;
//         DLinkedNode next;
//     }
//     private Map<Integer, DLinkedNode> cache = new HashMap<>();
//     private int size;
//     private int capacity;
//     private DLinkedNode head, tail;

//      public LRUCache(int capacity) {
//         this.size = 0;
//         this.capacity = capacity;
//         head = new DLinkedNode();
//         tail = new DLinkedNode();
//         head.next = tail;
//         tail.prev = head;
//     }

//     public int get(int key) {
//         DLinkedNode node = cache.get(key);
//         if (node == null) return -1;
//         moveToHead(node);
//         return node.value;
//     }
//     public void put(int key, int value) {
//         DLinkedNode node = cache.get(key);
//         if (node == null) {
//             DLinkedNode newNode = new DLinkedNode();
//             newNode.key = key;
//             newNode.value = value;
//             cache.put(key, newNode);
//             addNode(newNode);
//             size++;
//             if (size > capacity) {
//                 DLinkedNode tail = popTail();
//                 cache.remove(tail.key);
//                 size--;
//             }
//         } else {
//             node.value = value;
//             moveToHead(node);
//         }
//     }
//     }

//     private void addNode(DLinkedNode node) {
//         node.prev = head;
//         node.next = head.next;
//         head.next.prev = node;
//         head.next = node;
//     }




//      private void removeNode(DLinkedNode node) {
//         DLinkedNode prev = node.prev;
//         DLinkedNode next = node.next;
//         prev.next = next;
//         next.prev = prev;
//     }

//     private void moveToHead(DLinkedNode node) {
//         removeNode(node);
//         addNode(node);
//     }

//     private DLinkedNode popTail() {
//         DLinkedNode res = tail.prev;
//         removeNode(res);
//         return res;
//     }
// }

// /**
//  * Your LRUCache object will be instantiated and called as such:
//  * LRUCache obj = new LRUCache(capacity);
//  * int param_1 = obj.get(key);
//  * obj.put(key,value);
//  */