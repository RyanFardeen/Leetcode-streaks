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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1 = l1;
        ListNode rl2 = l2;
        ListNode ansList = new ListNode(0);
        ListNode curr = ansList;
        int carry = 0;
        while(rl1 != null || rl2 != null) {
            int a = rl1 == null ? 0 : rl1.val;
            int b = rl2 == null ? 0 : rl2.val ;
            int sum = a + b + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (rl1 != null) rl1 = rl1.next;
            if (rl2 != null) rl2 = rl2.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return ansList.next;
    }
}

