1class Solution {
2    public long countSubarrays(int[] nums, long k) {
3        long s=0l,c=0l;int l=0;
4        int n=nums.length;
5        for(int r=0;r<n;r++){
6            s+=(long)nums[r];
7            while(s*(r-l+1)>=k){
8                s-=(long)nums[l];
9                l++;
10            }
11            c+=(r-l+1);
12        }
13        return c;
14
15    }
16}