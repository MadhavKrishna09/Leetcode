/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head;
        if(head == null) return false;
        while(second.next!= null && second.next.next!=null){  
            first = first.next;
            second = second.next.next;
            if(first == second) return true;
        }
        return false;
    }
}