class Solution {
    public static boolean winnerSquareGame(int n) {
        boolean[] dp=new boolean[1000001];
        for(int i=0;i<=100000;i++){
            if(dp[i]){
                continue;
            }
            for(int j=1;j * j<=100000-1;j++){
                dp[i + j * j] = true;
            }
        }
        return dp[n];
    }
}