class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(String s:words){
            int sum=0;
            for(char c:s.toCharArray()){
                sum+=weights[c-'a'];
            }
            int i=sum%26;
            char c=(char)('z'-i);
            ans+=c;
        }
        return ans;
    }
}