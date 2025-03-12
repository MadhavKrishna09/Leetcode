/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> mp = new HashMap<>();
        Node n = head;
        while(n!=null){
            mp.put(n,new Node(n.val));
            n = n.next;
        }
        n = head;
        while (n != null) {
        mp.get(n).next = mp.get(n.next);
        mp.get(n).random = mp.get(n.random);
        n = n.next;
        }

        return mp.get(head);

    }
}