class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            int t=n;
            int sum=0;
            while(t!=0){
                sum+=t%10;
                t/=10;
            }
            min=Math.min(sum,min);
        }
        return min;
    }
}