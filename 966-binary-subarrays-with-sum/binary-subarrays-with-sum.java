class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int prefixSum = 0;
        int count =0;

        for(int i=0;i<nums.length;i++){
            int j=i;
            prefixSum =0;
            while(j<nums.length && prefixSum <= goal){
                prefixSum += nums[j];
                if(prefixSum == goal){
                    count++;
                }
                j++;
            }
        }
        return count;
        
    }
}