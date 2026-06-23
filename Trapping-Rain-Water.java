1class Solution {
2    public int trap(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int leftMax = height[left];
6        int rightMax = height[right];
7        int water = 0;
8
9        while (left < right) {
10            if (leftMax < rightMax) {
11                left++;
12                leftMax = Math.max(leftMax, height[left]);
13                water += leftMax - height[left];
14            } else {
15                right--;
16                rightMax = Math.max(rightMax, height[right]);
17                water += rightMax - height[right];
18            }
19        }
20
21        return water;        
22    }
23}