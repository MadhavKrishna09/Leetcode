class Solution {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for(int i =2;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
        // // int[] dp = new int[n+1];
        // if(n<=1) return 1;
        // // if(n<0) return 0;

        // // if(dp[n]!= 0) return dp[n];
        // // dp[n] = climbStairs(n-1) + climbStairs(n-2);

        // int prev1 = 1;
        // int prev2 = 1;
        // int curr;

        // for(int i=2;i<=n;i++){
        //     curr= prev1+prev2;
        //     prev1=prev2;
        //     prev2 = curr;
            
        // }

        // return prev2;
        // int[] dp = new int[n+1];
        // return helper(dp, n);


    }

    // public int helper(int[] dp, int n){
    //     if(n<0) return 0;
    //     if(n==0) return 1;
    //     if(dp[n] != 0) return dp[n];
    //     return dp[n] = helper(dp, n-1) + helper(dp, n-2);

    // }
}