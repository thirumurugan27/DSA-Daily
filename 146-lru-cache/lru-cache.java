class ListNode {
    ListNode next;
    ListNode prev;
    int val;
    ListNode(int c) {
        this.val = c;
        next = null;
        prev = null;
    }
}

class LRUCache {
    int n;
    ListNode tail;
    ListNode cur;
    Map<Integer, ListNode> map;
    Map<ListNode, Integer> rev;
    public LRUCache(int capacity) {
        n = capacity;
        map = new HashMap<>();
        rev = new HashMap<>();
    }
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        ListNode node = map.get(key);
        if (node != cur) {

            if (node.prev != null)
                node.prev.next = node.next;

            if (node.next != null)
                node.next.prev = node.prev;

            if (node == tail)
                tail = node.next;

            node.prev = cur;
            node.next = null;

            cur.next = node;
            cur = node;
        }

        return node.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {

            ListNode node = map.get(key);
            node.val = value;
            if (node != cur) {

                if (node.prev != null)
                    node.prev.next = node.next;

                if (node.next != null)
                    node.next.prev = node.prev;

                if (node == tail)
                    tail = node.next;

                node.prev = cur;
                node.next = null;

                cur.next = node;
                cur = node;
            }

            return;
        }
        if (map.size() == n) {

            int removeKey = rev.get(tail);

            map.remove(removeKey);
            rev.remove(tail);

            tail = tail.next;

            if (tail != null)
                tail.prev = null;
        }
        ListNode node = new ListNode(value);
        if (map.size() == 0) {
            tail = node;
            cur = node;
        } else {
            node.prev = cur;
            cur.next = node;
            cur = node;
        }
        map.put(key, node);
        rev.put(node, key);
    }
}