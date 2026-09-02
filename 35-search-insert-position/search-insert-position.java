class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            int mide=nums[mid];
            if(mide==target){
                return mid;
            }
            int lef=mid-1;
            int rit=mid+1;
            if(mide>target){
                r=mid-1;
                if(lef<0 || nums[lef]<target){
                    return mid;
                }
            }
            else{
                l=mid+1;
                if(rit>=nums.length || nums[rit]>target){
                    return mid+1;
                }
            }
        }
        return -1;
    }
}