class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] freq = new int[101];
        for(int i=0;i<n;i++){
            if(nums[i] !=0){
                freq[nums[i]]++;

            }
        }

        for(int i = 0;i<101;i++){
            if(freq[i]!=0){
                ans++;
            }
        }

        return ans;
    }
}