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
        if(head == null||head.next == null) return false;
        if(head.next != null) first = first.next;
        if(first.next!=null) second = first.next;
        while(true){  
            if(first == second) return true;
            if(first.next != null){
                first=first.next;
            }
            else break;
            if(second.next!= null && second.next.next!=null){
                second = second.next.next;
            }
            else break;
        }
        return false;
    }
}