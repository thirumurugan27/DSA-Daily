class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lSum = 0, rSum = 0, totalSum = 0;

        for (int i = 0; i < k; i++) {
            lSum += cardPoints[i];
        }

        int maxSum = lSum;
        int rightIndex = cardPoints.length - 1;

        for (int i = k - 1; i >= 0; i--) {
            lSum -= cardPoints[i];
            rSum += cardPoints[rightIndex];
            totalSum = lSum + rSum;
            maxSum = Math.max(maxSum, totalSum);
            rightIndex--;
        }

        return maxSum;
    }
}