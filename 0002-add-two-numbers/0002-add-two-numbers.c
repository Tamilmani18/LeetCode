/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode current = null;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;

            carry = sum / 10;
            int digit = sum % 10;

            // Create a new node to store the current digit.
            ListNode newNode = new ListNode(digit);

            // If 'result' is null, it means this is the first node.
            if (result == null) {
                result = newNode;
                current = result;
            } else {
                // Append the new node to the existing result.
                current.next = newNode;
                current = newNode;
            }

            // Move to the next nodes in l1 and l2 if they exist.
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return result;
    }
}

