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
    static int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode root) {
        if(root==null || root.next==null) return root;
        ListNode cur=root;
        while(cur.next!=null){
            ListNode nn=new ListNode(gcd(cur.val,cur.next.val));
            nn.next=cur.next;
            cur.next=nn;
            cur=cur.next.next;
        }
        return root;
    }
}