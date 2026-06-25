1class Solution {
2    public int search(int[] nums, int target) {
3        int l=0,mid=0,n=nums.length,r=n-1;
4        while(l<=r){
5            mid=(l+r)/2;
6            if(nums[mid]==target) return mid;
7            if(nums[l] <=nums[mid]){
8                if(target>=nums[l] && target<nums[mid]){
9                    r=mid-1;
10                }else{
11                    l=mid+1;
12                }
13            }else{
14                if(target>nums[mid] && target<=nums[r]){
15                    l=mid+1;
16                }else r=mid-1;
17            }
18        }
19        return -1;
20    }
21}