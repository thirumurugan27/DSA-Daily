class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0, sum = 0;
        int left = 0, count = 0;
        int[] freq = new int[100001];

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            if (freq[num] == 0) {
                count++;
            }
            freq[num]++;
            sum += num;
            if (right - left + 1 == k) {
                if (count == k) {
                    max = Math.max(sum, max);
                }
                sum -= nums[left];
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) {
                    count--;
                }
                left++;
            }
        }
        return max;
    }
}