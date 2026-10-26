class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=-Double.MAX_VALUE;
        double sum=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if(right-left+1==k){
                max=Math.max(max,sum/(right-left+1));
                System.out.println(max<sum);
                sum-=nums[left];
                left++;
            }
        }
        return max;
    }
}