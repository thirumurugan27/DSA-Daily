class Solution {
    public int digitFrequencyScore(int n) {
        if(n<10) return n;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n!=0){
            int r=n%10;
            map.put(r,map.getOrDefault(r,0)+1);
            n/=10;
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            sum+=(entry.getKey()*entry.getValue());
        }
        return sum;
    }
}