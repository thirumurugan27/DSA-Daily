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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1==null) return list1;
        int idx=0;
        ListNode cur=list1;
        for(int i=0;i<a-1;i++){
            cur=cur.next;
        }
        ListNode st=cur;
        for(int i=a;i<=b+1;i++){
            cur=cur.next;
        }
        st.next=list2;
        ListNode cur2=list2;
        while(cur2.next!=null) cur2=cur2.next;
        cur2.next=cur;
        return list1;
    }
}