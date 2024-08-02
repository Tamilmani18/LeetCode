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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        if(n==0) return null;
        int interval = 1;
        while(interval < n) {
            for(int i = 0; i + interval < n; i = i + interval * 2) {
                lists[i] = mergeToSortedLists(lists[i], lists[i + interval]);
            }
            interval = 2 * interval;
        }
        return lists[0];
    }

    public ListNode mergeToSortedLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode curr = head;

        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                curr = curr.next;
                list1 = list1.next;
            } else {
                curr.next = list2;
                curr = curr.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) curr.next = list2;
        if (list2 == null) curr.next = list1;
        return head.next;
    }
}