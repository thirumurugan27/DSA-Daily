class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd=Integer.MAX_VALUE,evenC=0;
        for(int i:nums1){
            minOdd=Math.min(minOdd,i);
            if(i%2==0) evenC++;
        }
        return minOdd%2==1 || evenC==nums1.length;
    }
}