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
    public ListNode rev(ListNode head){
        if(head==null ||head.next==null) return head;
        ListNode newHead=rev(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
    public ListNode kthNode(ListNode node,int k){
        k-=1;
        while(node!=null && k>0){
            node=node.next;
            k--;
        }
        return node;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kth=kthNode(temp,k);
            if(kth==null){
                if(prev!=null) prev.next=temp;
                break;
            }
            ListNode nextNode=kth.next;
            kth.next=null;
            rev(temp);
            if(prev==null){
                head=kth;
            }
            else{
                prev.next=kth;
            }
            prev=temp;
            temp=nextNode;
        }
        return head;
    }
}