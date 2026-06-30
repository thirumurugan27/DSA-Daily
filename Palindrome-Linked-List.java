1class Solution {
2    public boolean isPalindrome(ListNode head) {
3        StringBuilder sb = new StringBuilder();
4
5        while (head != null) {
6            sb.append(head.val);
7            head = head.next;
8        }
9
10        return sb.toString().equals(sb.reverse().toString());
11    }
12}