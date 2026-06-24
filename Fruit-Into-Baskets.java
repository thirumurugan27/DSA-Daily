1class Solution {
2    public int totalFruit(int[] f) {
3        int n=f.length;
4        int l=0,max=0;
5        HashMap<Integer,Integer> mp= new HashMap<>();
6        for(int r=0;r<n;r++){
7            mp.put(f[r],mp.getOrDefault(f[r],0)+1);
8            while(mp.size()>2){
9                mp.put(f[l],mp.get(f[l])-1);
10                if(mp.get(f[l])==0){
11                    mp.remove(f[l]);
12                }
13                l++;
14            }
15
16            max=Math.max(max,r-l+1);
17        }
18        return max;
19    }
20}