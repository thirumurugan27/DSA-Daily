class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
        for(int num:nums){
            if(num==0)z++;
            else if(num==1) o++;
            else t++;
        }
        int i=0;
        while(i<nums.length){
            if(z-->0) nums[i++]=0;
            else if(o-->0) nums[i++]=1;
            else nums[i++]=2;
        }
        // return nums;
    }
}