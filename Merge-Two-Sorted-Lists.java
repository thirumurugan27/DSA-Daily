1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
13        if(l1==null)return l2;
14        if(l2==null) return l1;
15        if(l1.val<l2.val){
16            l1.next=mergeTwoLists(l1.next,l2);
17        }else{
18            l2.next=mergeTwoLists(l1,l2.next);
19            return l2;
20        }
21        return l1;
22    }
23}