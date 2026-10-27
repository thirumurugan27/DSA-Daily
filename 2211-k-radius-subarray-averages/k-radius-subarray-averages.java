class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int w = 2*k + 1;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);

        if(n >= w){
            long sum = 0;
            for(int i = 0 ; i < w ; i++){
                sum += nums[i];
            }
            arr[k++] = (int)(sum/w);

            for(int i = w ; i < n ; i++){
                sum -= nums[i-w];
                sum += nums[i];

                arr[k++] = (int)(sum/w);
            }
        }

        return arr;
    }
}