class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int oddC=0,evenC=0;
        for(int i:nums1){
            if(i%2==0) evenC++;
            else oddC++;
        }
        if(oddC==n || evenC==n){
            return true;
        }
        if(oddC!=0){
            return true;
        }
        return false;

    }
}