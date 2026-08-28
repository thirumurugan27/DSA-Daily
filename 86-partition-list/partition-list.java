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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode lp = left;
        ListNode rp = right;

        while (head != null) {
            if (head.val < x) {
                lp.next = head;
                lp = lp.next;
            } else {
                rp.next = head;
                rp = rp.next;
            }

            head = head.next;
        }

        lp.next = right.next;
        rp.next = null;

        return left.next;        
    }
}