class Solution {
    // public int rob(int[] nums) {
        // int n = nums.length;
    //     int[] dp = new int[n];
    //     dp[0] = nums[0];
    //     if(n>1) dp[1] = Math.max(nums[1],nums[0]);
    //     // if(n==2) return Math.max(dp[0],dp[1]);

    //     for(int i = 2;i<n;i++){
    //         dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
    //     }

    //     return dp[n-1];
    // }

    public int rob(int[] nums){
        int n = nums.length;
        if(n==1) return nums[0];
        int first = nums[0];
        int second = Math.max(nums[1], first);

        for(int i =2;i<n;i++){
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;

            
        }

        return second;

    }
}