1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3     int l=0,r=nums.length -1,mid,first=-1,last=-1;
4     while(l<=r){
5        mid=(l+r)/2;
6        if(nums[mid]==target){
7            first=mid;
8            r=mid-1;
9        }else if(nums[mid]<target) l=mid+1;
10        else r=mid-1;
11     }
12     int lo=0,ri=nums.length-1;
13     while(lo<=ri){
14        mid=(lo+ri)/2;
15        if(nums[mid]==target){
16            last=mid;
17            lo=mid+1;
18        }else if(nums[mid]<target) lo=mid+1;
19        else ri=mid-1;
20     }
21     return new int[]{first,last};
22    }
23}