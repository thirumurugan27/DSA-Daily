class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<Integer> idx=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') idx.add(i);
        }
        if(idx.size()<k) return "";

        String ans="";

        for(int i=0;i+k-1 < idx.size();i++){
            int st=idx.get(i);
            int en=idx.get(i+k-1);
            String cur=s.substring(st,en+1);
            if(ans.isEmpty() || cur.length()<ans.length() || 
            (cur.length()==ans.length() && cur.compareTo(ans)<0)){
                ans=cur;
            }
        }
        return ans;
    }
}