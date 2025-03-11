/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        ListNode slow = start;
        ListNode fast = start;
        start.next = head;

        while(n>=0 && fast!=null){
            fast = fast.next;
            n--;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }

        // ListNode temp = slow.next;
        // if(temp!=null)
        //     {slow.next = temp.next;
        //     temp.next = null;}
        slow.next = slow.next.next;

        return start.next;
    }
}