1class Solution {
2    public int findMin(int[] nums) {
3        int l=0,n=nums.length,r=n-1,min=Integer.MAX_VALUE;
4        while(l<=r){
5            int mid=(l+r)/2;
6            if(nums[l]<=nums[mid]){
7                if(nums[l]<min){
8                    min=nums[l];
9                }
10                l=mid+1;
11            }else{
12                if(nums[mid]<min) min=nums[mid];
13                r=mid-1;
14            }
15        }
16        return min;
17    }
18}