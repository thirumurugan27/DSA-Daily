class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        if(nums.length==0) return ans;
        for(int num:nums){
            int n=ans.size();
            boolean isAdded=false;
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(!ans.get(i).contains(num)){
                    ans.get(i).add(num);
                    isAdded=true;
                    break;
                }
            }
            if(!isAdded){
                sub.add(num);
                ans.add(sub);
            }
        }
        return ans;
    }
}