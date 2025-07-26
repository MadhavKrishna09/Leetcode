class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode l3 = head;
        // head = l3;
        int carry = 0;
        while(l1!=null && l2!=null){
            ListNode temp = new ListNode();
            int v1 = l1.val;
            int v2 = l2.val;
            int sum = (v1 + v2 +carry);
            temp.val = sum % 10;
            carry = sum / 10;
            l3.next = temp;
            l3 = temp;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            ListNode temp = new ListNode();
            int v1 = l1.val;
            int sum = (v1 + carry);
            temp.val = sum % 10;
            carry = sum / 10;
            l3.next = temp;
            l3 = temp;
             l1 = l1.next;
        }
        while(l2 != null){
            ListNode temp = new ListNode();
            int v2 = l2.val;
            int sum = (v2 + carry);
            temp.val = sum % 10;
            carry = sum / 10;
            l3.next = temp;
            l3 = temp;
            l2 = l2.next;
        }
        while(carry>0){
            ListNode temp = new ListNode();
            temp.val = carry % 10;
            carry = carry / 10;
            l3.next = temp;
            l3 = temp;
        }

        return head.next;
    }
}