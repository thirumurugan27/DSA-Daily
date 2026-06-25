1class Solution {
2    int f(int[] arr, int day, int k) {
3        int flowers_in_hand = 0, b = 0;
4        for (int i = 0; i < arr.length; i++) {
5            if (arr[i] <= day) {
6                flowers_in_hand++;
7                if (flowers_in_hand == k) {
8                    b++;
9                    flowers_in_hand = 0;
10                }
11            } else {
12                flowers_in_hand = 0;
13            }
14        }
15        return b;
16    }
17    public int minDays(int[] arr, int m, int k) {
18        int n = arr.length;
19        if ((long) m * k > n) return -1;
20        int max = arr[0];
21        for (int i = 1; i < n; i++) {
22            max = Math.max(max, arr[i]);
23        }
24        int l = 1, r = max;
25        while (l <= r) {
26            int day = l + (r - l) / 2;
27            int b = f(arr, day, k);
28            if (b < m) {
29                l = day + 1;
30            } else {
31                r = day - 1;
32            }
33        }
34        return l;
35    }
36}