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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead=new ListNode(0);
        newHead.next=head;
        ListNode cur=head;
        ListNode prev=newHead;
       while(cur!=null){
        boolean dup=false;
            while(cur.next!=null&&cur.next.val==cur.val){
                dup=true;
                cur=cur.next;
            }
            if(dup) prev.next=cur.next;
            else prev=cur;
            cur=cur.next;
       }
        return newHead.next;
    }
}