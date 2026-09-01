class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode cur = head;
        int idx = 0;
        while (cur != null) {
            map.put(idx++, cur);
            cur = cur.next;
        }
        int n = idx;
        ListNode dummy = new ListNode(0);
        cur = dummy;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            cur.next = map.get(left++);
            cur = cur.next;
            if (left <= right) {
                cur.next = map.get(right--);
                cur = cur.next;
            }
        }
        cur.next = null;
        head = dummy.next;
    }
}