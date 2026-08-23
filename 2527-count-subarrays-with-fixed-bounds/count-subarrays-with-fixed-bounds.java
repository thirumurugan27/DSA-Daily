class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
       long ts=0;
       int mini=-1,maxi=-1,badi=-1;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<minK || nums[i]>maxK){
            badi=i;
        }
        if(nums[i]==minK) maxi=i;
        if(nums[i]==maxK) mini=i;
        int vsc=Math.min(mini,maxi)-badi;
        if(vsc>0) ts+=vsc;
       } 
       return ts;
    }
}