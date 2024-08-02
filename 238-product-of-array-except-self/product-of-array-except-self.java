class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefixSum = 0;
        int n =nums.length;
        int[] ans = new int[n];
        // int[] prefix = new int[n];
        // // int[] suffix = new int[n];
        // prefix[0] = 1;
        // suffix[n-1] = 1;
        int  suffix =1;
        ans[0]=1;


        for(int i=1;i<nums.length;i++){
            // prefix[i] = nums[i-1]*prefix[i-1];
            // suffix[n-i-1] = nums[n-i]*suffix[n-i];    
            ans[i] = ans[i-1]*nums[i-1];
        }

        for(int i =n-1;i>=0;i--){
            ans[i] = suffix * ans[i];
            suffix = suffix * nums[i];
        }
        return ans;
        
    }
}