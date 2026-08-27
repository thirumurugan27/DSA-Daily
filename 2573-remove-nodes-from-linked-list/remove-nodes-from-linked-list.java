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
    public ListNode removeNodes(ListNode head) {
        if(head==null) return head;
        ListNode node =head;
        ListNode nextGreater=removeNodes(node.next);
        node.next=nextGreater;
        if(nextGreater==null || node.val>=nextGreater.val){
            return node;
        }
        return nextGreater;
    }
}