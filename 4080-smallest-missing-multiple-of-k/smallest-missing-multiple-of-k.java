class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] seen= new boolean[201];
        for(int n:nums) seen[n]=true;

        int ans=k;
        while(seen[ans]) ans+=k;

        return ans;
    }
}