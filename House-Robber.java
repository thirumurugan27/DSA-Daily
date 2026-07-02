1class Solution {
2    int f(int i,int[] nums,int[] dp){
3        if(i==0) return nums[0];
4        if(dp[i]!=-1) return dp[i];
5        int notpick=0+f(i-1,nums,dp);
6        int pick = nums[i];
7        if(i>=2) pick+=f(i-2,nums,dp);
8        return dp[i]=Math.max(pick,notpick);    
9    }
10    public int rob(int[] nums) {
11        int n=nums.length;
12        int[] dp=new int[n];
13        Arrays.fill(dp,-1);
14        int ans=f(n-1,nums,dp);
15        return ans;
16    }
17}