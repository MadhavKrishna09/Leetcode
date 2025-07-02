class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = sum+stones[i];
        }

        boolean[][] dp = new boolean[n+1][sum/2+1];
        for(int i =0;i<=n;i++){
            for(int j= 0;j<=sum/2;j++){
                if(i==0) dp[i][j] = false;
                if(j==0) dp[i][j] = true;
            }
        }
        for(int i =1;i<=n;i++){
            for(int j= 1;j<=sum/2;j++){
                if(stones[i-1] <=j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-stones[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        int ans = 0;
        for(int j = sum/2;j>=0;j--){
            if(dp[n][j]){
                ans = sum - 2*j;
                break;
            }
        }
        return ans;

    }
}