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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int k =0;
        
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                k = calculateLength(slow);
                break;
            }
            
        }
        if (fast == null || fast.next == null) return null;

        return start(head, k);
    }


    public int calculateLength(ListNode start){
        ListNode curr = start;
        int k = 0;
        do{
            curr=curr.next;
            k++;
        }while(curr!=start);

        return k;
    }

    public ListNode start(ListNode head, int k){
        ListNode fast = head, slow = head;

        while(k>0){
            fast = fast.next;
            k--;
        }

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}