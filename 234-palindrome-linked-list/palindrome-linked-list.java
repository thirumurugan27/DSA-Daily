class Solution {
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode nhead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return nhead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverse(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null){
            if(first.val!=second.val) return false;
            first=first.next;
            second=second.next;
        }
        reverse(newHead);
        return true;
        // StringBuilder sb = new StringBuilder();

        // while (head != null) {
        //     sb.append(head.val);
        //     head = head.next;
        // }

        // return sb.toString().equals(sb.reverse().toString());
    }
}