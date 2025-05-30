class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        while(l<h){
            int mid = (l+h)/2;
            if(nums[mid] > nums[n-1]){
                l = mid+1;
            }
            else{
                h = mid;
            }
        }
        return nums[l];
    }
}