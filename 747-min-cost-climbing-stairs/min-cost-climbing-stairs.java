class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        // fill the whole array with -1.
        dp[n] = 0;
        dp[n-1] = cost[n-1];

        for(int i = n-2;i>=0;i--){
                dp[i]=cost[i] + Math.min(dp[i+1] , dp[i+2]);
            
        }

        return Math.min(dp[0], dp[1]);
        
        
    }






    // public int minCostClimbingStairs(int[] cost){
    //     int n = cost.length;
    //     int[] dp = new int[n+1];

    //     return helper(dp, n, cost);
    // }

    // public int helper(int[] dp, int n, int[] cost){
    //     if(n==0 || n==1) return dp[n] =  Math.min(cost[0], cost[1]);
    //     if(dp[n] != 0) return dp[n];
    //     dp[n] = Math.min(cost[n-2], dp[n-1]);
    //     return Math.min(helper(dp, n-1, cost) , helper(dp, n-2, cost));

    // }

//     public int minCostClimbingStairs(int[] cost) {
//     int n = cost.length;
//     int[] dp = new int[n];
//     return Math.min(helper(dp, n-1, cost), helper(dp, n-2, cost));
// }

// public int helper(int[] dp, int n, int[] cost) {
//     if (n < 0) return 0;
//     if (n == 0) return cost[0];  // Base case: start at step 0
//     if (n == 1) return Math.min(cost[0] + cost[1], cost[1]); // Start at 0 or 1
//     if (dp[n] != 0) return dp[n];
    
//     // Correct recurrence: cost[n] + min of previous steps
//     dp[n] = cost[n] + Math.min(helper(dp, n-1, cost), helper(dp, n-2, cost));
//     return dp[n];
// }
}