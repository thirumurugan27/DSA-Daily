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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> li= new ArrayList<>();
        while(head!=null){
            li.add(head.val);
            head=head.next;
        }
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[li.size()];
        for(int i=0;i<li.size();i++){
            while(!st.isEmpty() && li.get(i)>li.get(st.peek())){
                ans[st.pop()]=li.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}