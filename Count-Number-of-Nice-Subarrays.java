1class Solution {
2    public int f(int[] nums,int k){
3        if(k<0) return 0;
4        int l=0,c=0,odd=0;
5        for(int r=0;r<nums.length;r++){
6            if(nums[r]%2==1) odd++;
7            while(odd>k){
8                if(nums[l]%2==1) odd--;
9                l++;
10            }
11            c+=(r-l+1);
12        }
13        return c;
14    }
15    public int numberOfSubarrays(int[] nums, int k) {
16        return f(nums,k)-f(nums,k-1);                                                                           
17    }
18}