class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int freq = 0;

        for(int n:nums){
            if(freq == 0){
                res = n;
            }

            freq += res == n? +1 : -1;
        }
        // Arrays.sort(nums);
        // int n = nums.length/2;
        return res ;
    }
}