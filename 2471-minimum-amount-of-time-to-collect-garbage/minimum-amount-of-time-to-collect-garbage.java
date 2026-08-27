class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans=0;
        for(String s:garbage) ans+=s.length();

        boolean m=false,p=false,g=false;
        for(int i=travel.length;i>0;i--){
            m=m||garbage[i].contains("M");
            g=g||garbage[i].contains("G");
            p=p||garbage[i].contains("P");
            ans += travel[i-1] * ((m ? 1 : 0) + (p ? 1 : 0) + (g ? 1 : 0));
        }

        return ans;
    }
}