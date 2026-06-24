1class Solution {
2    int f(int[] nums,int  k){
3        if(k<0) return 0;
4        int n=nums.length;
5        int l=0,c=0,s=0;
6        for(int r=0;r<n;r++){
7            s+=nums[r];
8            while(s>k){
9                s-=nums[l];
10                l++;
11            }
12            c+=(r-l+1);
13        }
14        return c;
15    }
16    public int numSubarraysWithSum(int[] nums, int goal) {
17        return f(nums,goal)-f(nums,goal-1);
18    }
19}