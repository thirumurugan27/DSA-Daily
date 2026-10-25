class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    private int atMost(int[] nums,int k){
       if(k<0)return 0;
       int[] freq=new int[nums.length+1];
      
       int left=0;
       int count=0;
       int zeros=0;
       for(int right=0;right<nums.length;right++){
        int val=nums[right];
        if(freq[val]==0)zeros++;
        freq[val]++;
        while(zeros>k){
            freq[nums[left]]--;
            if(freq[nums[left]]==0)zeros--;
            left++;
        }
        count+=right-left+1;
       }    
        return count;
    }
}