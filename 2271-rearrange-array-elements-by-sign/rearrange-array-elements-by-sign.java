class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> pos=new LinkedList<>();
        Queue<Integer> neg=new LinkedList<>();
        for(int i:nums){
            if(i<0) neg.offer(i);
            else pos.offer(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i++]=pos.poll();
            nums[i]=neg.poll();
        }
        return nums;
    }
}