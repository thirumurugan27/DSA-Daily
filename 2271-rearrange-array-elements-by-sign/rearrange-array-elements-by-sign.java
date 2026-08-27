class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int negi=1,posi=0;
        for(int i:nums){
            if(i<0){
                ans[negi]=i;
                negi+=2;
            }else{
                ans[posi]=i;
                posi+=2;
            }
        }
        return ans;
    }
}