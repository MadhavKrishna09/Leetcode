class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j=nums.length-1;
        int max=Integer.MIN_VALUE;

        while(i<j){
            int sum = nums[i]+nums[j];
            if(nums[i] + nums[j] ==0){
                // max = Math.max(max, nums[j]);
                // i++;j--;
                return nums[j];
            } else if(sum<0){ 
                i++;
                }
            else {
                j--;
                }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}