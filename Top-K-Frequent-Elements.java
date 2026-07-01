1class pair{
2    int ele;
3    int freq;
4    pair(int ele,int freq){
5        this.ele=ele;
6        this.freq=freq;
7    }
8}
9class Solution {
10    public int[] topKFrequent(int[] nums, int k) {
11        List<Integer> li=new ArrayList();
12        HashMap<Integer,Integer> map=new HashMap<>();
13        for(int num:nums){
14           map.put(num,map.getOrDefault(num,0)+1);
15        }
16        PriorityQueue<pair> q= new PriorityQueue<>((a,b)->{
17            return a.freq-b.freq;
18        });
19        for(var it:map.entrySet()){
20            int ele=it.getKey();
21            int freq=it.getValue();
22            q.add(new pair(ele,freq));
23            if(q.size()>k) q.poll();
24        }
25        int [] ans=new int [k];
26        int i=0;
27        while(q.size()>0){
28            pair temp=q.poll();
29            ans[i]=temp.ele;
30            i++;
31        }
32        return ans;
33    }
34}