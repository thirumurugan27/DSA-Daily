class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int c=0,max=0;
        for(int i=0;i<nums.length-1;i++){
            if(Math.abs(nums[i]-nums[i+1])==1){
                 c++;
                 max=Math.max(max,c);
            }
            else if(Math.abs(nums[i]-nums[i+1])==0){
                continue;
            }
            else c=0;
            
        }
        return max+1;
    }
}