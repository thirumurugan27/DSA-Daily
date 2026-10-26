class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0,ans=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            if(right-left+1==k){
                if((sum/k)>=threshold) ans++;
                sum-=arr[left++];
            }
        }
        return ans;
    }
}