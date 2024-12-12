class Solution {
    public int climbStairs(int n) {
        // int[] dp = new int[n+1];
        if(n<=1) return 1;
        // if(n<0) return 0;

        // if(dp[n]!= 0) return dp[n];
        // dp[n] = climbStairs(n-1) + climbStairs(n-2);

        int prev1 = 1;
        int prev2 = 1;
        int curr;

        for(int i=2;i<=n;i++){
            curr= prev1+prev2;
            prev1=prev2;
            prev2 = curr;
            
        }

        return prev2;

    }
}