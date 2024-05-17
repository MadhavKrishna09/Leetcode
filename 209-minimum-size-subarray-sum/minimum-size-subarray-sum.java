class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowEnd = 0;

        for(;windowEnd<nums.length;windowEnd++){
            sum += nums[windowEnd];
            while(sum>=target){
                minLength = Math.min(windowEnd - windowStart+1, minLength);
                sum -= nums[windowStart];
                windowStart++;
            }
        }

        // while(sum>=target){
        //         minLength = Math.min(windowEnd - windowStart, minLength);
        //         sum -= nums[windowStart];
        //         windowStart++;
        // }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}