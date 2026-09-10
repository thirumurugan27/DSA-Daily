class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int l1=word1.length(),l2=word2.length();
        int min=Math.min(l1,l2);
        int max=Math.max(l1,l2);
        for(int k=0;k<min;k++){
            ans+=word1.charAt(k);
            ans+=word2.charAt(k);
        }
        if(l1>l2){
            ans+=word1.substring(min,max);
        }else{
            ans+=word2.substring(min,max);
        }
        return ans;
    }
}