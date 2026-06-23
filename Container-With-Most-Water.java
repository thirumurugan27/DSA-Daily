1class Solution {
2    public int maxArea(int[] h) {
3        int max=0;
4        int n=h.length;
5        int l=0,r=n-1;
6        while(l<=r){
7            int len=Math.min(h[l],h[r]);
8            int b=r-l;
9            int area = len*b;
10            if(area>max) max=area;
11            if(h[l]<=h[r]) l++;
12            else r--;
13        }
14        return max;
15    }
16}