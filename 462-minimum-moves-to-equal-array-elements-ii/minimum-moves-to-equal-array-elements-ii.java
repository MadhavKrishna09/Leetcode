class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        long index = nums.length/2;
        int n = nums[(int)index];
        int ans = 0;

        for(int i =0;i<nums.length;i++){
            ans +=Math.abs(n - nums[i]) ;
        }


        return ans;
    }
}