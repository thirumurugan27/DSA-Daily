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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        ListNode newHead=new ListNode(0);
        newHead.next=head;
        ListNode cur=newHead;
        while(cur.next!=null){
            if(set.contains(cur.next.val)){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return newHead.next;

    }
}