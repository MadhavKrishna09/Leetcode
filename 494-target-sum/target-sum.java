class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        for(int i:nums){
            sum+=i;
        }

        if(sum < target) return 0;
        if((target + sum) % 2 == 1 ||  (target + sum)<0) return 0;
        // if()
        target = target + (sum-target) /2;
        
        //difference should be target;
        //count the ways
        int[][] dp = new int[n+1][target+1];

        for(int i =0 ;i<=n;i++){
            for(int j= 0;j<=target;j++){
                if(i==0) dp[i][j] = 0;
                if(j==0) dp[i][j] =1;
            }
        }
        // dp[0][0] = 1;
        for(int i =1 ;i<=n;i++){
            for(int j= 0;j<=target;j++){
                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][target];

    }
}