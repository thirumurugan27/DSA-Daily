class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] pfreq=new int[26];
        int cnt=0;
        for(char c:p.toCharArray()){
            pfreq[c-'a']++;
            if(pfreq[c-'a']==1) cnt++;
        }
        int slide=p.length();
        for(int i=0;i<=s.length()-slide;i++){
            String sub=s.substring(i,i+slide);
            int[] subfreq=new int[26];
            for(char c:sub.toCharArray()){
                subfreq[c-'a']++;
            }
            int sc=0;
            for(int idx=0;idx<26;idx++){
                if(pfreq[idx]!=subfreq[idx]){
                    break;
                }
                if(pfreq[idx]==subfreq[idx]){
                    sc++;
                }
            }
            if(sc==26){
                ans.add(i);
            }
        }
        return ans;
    }
}