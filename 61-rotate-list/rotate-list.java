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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;
        int l=0;
        ListNode tem=head;
        while(tem!=null){
            tem=tem.next;
            l++;
        }
        k=k%l;
        while (k > 0) {

            ListNode temp = head;
            ListNode prev = null;

            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            temp.next = head;
            head = temp;

            k--;
        }

        return head;
    }
}