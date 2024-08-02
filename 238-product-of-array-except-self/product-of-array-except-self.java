class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixSum = 0;
        int n =nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;


        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i-1]*prefix[i-1];
            suffix[n-i-1] = nums[n-i]*suffix[n-i];  
        }

        for(int i =0;i<n;i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
        
    }
}