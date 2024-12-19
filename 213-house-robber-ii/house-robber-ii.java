class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // int[] dp = new int[n];
        if(n==1) return nums[0];
        // if(n==2) return 0;
        // how do i know that first one is included or not.
        // dp[0] = Math.max(nums[0], nums[n-1]);
        // dp[0] = nums[0];
        // if(n>1) dp[1] = Math.max(dp[0], nums[1]);

        // for(int i=2;i<n;i++){
        //     dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        // }

        // if(n%2 == 0) return dp[n-1];
        // return dp[n-2];
        int a = helper(nums, 0,n-1 );
        int b = helper(nums, 1, n);
        return Math.max(a,b);
    }

    public int helper(int[] nums, int  start, int end){
        int first = 0;
        int second = 0;
        int n = nums.length;

        for(int i = start;i<end;i++){
            int temp = first+nums[i];
            first = second;
            second = Math.max(temp, first);
        }

        return second;
    }
}