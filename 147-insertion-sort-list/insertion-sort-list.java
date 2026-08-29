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
    public ListNode insertionSortList(ListNode head) {
        ListNode cur=head;
        List<Integer> li= new ArrayList<>();
        while(cur!=null){
            li.add(cur.val);
            cur=cur.next;
        }
        cur=head;
        Collections.sort(li);
        for(int i:li){
            cur.val=i;
            cur=cur.next;
        }
        return head;
    }
}