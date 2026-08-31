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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        Arrays.fill(ans,-1);
        if(head==null || head.next==null || head.next.next==null)
            return ans;
        ListNode prev=head;
        ListNode cur=prev.next;
        List<Integer> li=new ArrayList<>();
        int idx=1;
        while(cur!=null && cur.next!=null){
            if(cur.val<prev.val && cur.val<cur.next.val){
                li.add(idx);
            }
            if(cur.val>prev.val && cur.val>cur.next.val){
                li.add(idx);
            }
            idx++;
            prev=prev.next;
            cur=cur.next;
        }
        if(li.size()<2)
            return ans;
        ans[0]=Integer.MAX_VALUE;
        for(int i=li.size()-1;i>0;i--){
            int dif=li.get(i)-li.get(i-1);
            ans[0]=Math.min(ans[0],dif);
        }
        ans[1]=li.get(li.size()-1)-li.get(0);
        return ans;
    }
}