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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode cur=head;
        int n=0;
        while(cur!=null){
            cur=cur.next;
            n++;
        }
        ListNode[] ans=new ListNode[k];
        cur=head;
        int size=n/k;
        int extra=n%k;
        for(int i=0;i<k;i++){
            ans[i]=cur;
            int tsize=size+(i<extra?1:0);
            for(int j=1;j<tsize;j++){
                cur=cur.next;
            }
            if(cur!=null){
                ListNode next=cur.next;
                cur.next=null;
                cur=next;
            }
        }
        return ans;
    }
}