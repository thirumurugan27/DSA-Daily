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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=head;
        ListNode prev=dummy;
        while(cur!=null && cur.next!=null){
            ListNode nextP=cur.next.next;
            ListNode second=cur.next;

            second.next=cur;
            cur.next=nextP;
            prev.next=second;

            prev=cur;
            cur=nextP;
        }
        return dummy.next;
    }
}