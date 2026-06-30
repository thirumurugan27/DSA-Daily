1class MyLinkedList {
2
3    class Node {
4        int data;
5        Node next;
6
7        Node(int data) {
8            this.data = data;
9        }
10    }
11
12    Node head;
13    Node tail;
14    int n;
15
16    public MyLinkedList() {
17        head = null;
18        tail = null;
19        n = 0;
20    }
21
22    public int get(int index) {
23        if (index < 0 || index >= n)
24            return -1;
25
26        Node temp = head;
27        for (int i = 0; i < index; i++) {
28            temp = temp.next;
29        }
30        return temp.data;
31    }
32
33    public void addAtHead(int val) {
34        Node nn = new Node(val);
35
36        if (n == 0) {
37            head = tail = nn;
38        } else {
39            nn.next = head;
40            head = nn;
41        }
42        n++;
43    }
44
45    public void addAtTail(int val) {
46        Node nn = new Node(val);
47
48        if (n == 0) {
49            head = tail = nn;
50        } else {
51            tail.next = nn;
52            tail = nn;
53        }
54        n++;
55    }
56
57    public void addAtIndex(int index, int val) {
58        if (index < 0 || index > n)
59            return;
60
61        if (index == 0) {
62            addAtHead(val);
63            return;
64        }
65
66        if (index == n) {
67            addAtTail(val);
68            return;
69        }
70
71        Node nn = new Node(val);
72        Node temp = head;
73
74        for (int i = 0; i < index - 1; i++) {
75            temp = temp.next;
76        }
77
78        nn.next = temp.next;
79        temp.next = nn;
80        n++;
81    }
82
83    public void deleteAtIndex(int index) {
84        if (index < 0 || index >= n)
85            return;
86
87        // Only one node
88        if (head == tail) {
89            head = tail = null;
90            n--;
91            return;
92        }
93
94        // Delete head
95        if (index == 0) {
96            head = head.next;
97            n--;
98            return;
99        }
100
101        // Delete tail
102        if (index == n - 1) {
103            Node temp = head;
104            for (int i = 0; i < n - 2; i++) {
105                temp = temp.next;
106            }
107            temp.next = null;
108            tail = temp;
109            n--;
110            return;
111        }
112
113        // Delete middle node
114        Node temp = head;
115        for (int i = 0; i < index - 1; i++) {
116            temp = temp.next;
117        }
118
119        temp.next = temp.next.next;
120        n--;
121    }
122}
123
124/**
125 * Your MyLinkedList object will be instantiated and called as such:
126 * MyLinkedList obj = new MyLinkedList();
127 * int param_1 = obj.get(index);
128 * obj.addAtHead(val);
129 * obj.addAtTail(val);
130 * obj.addAtIndex(index,val);
131 * obj.deleteAtIndex(index);
132 */