class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int n=nums.length;
        int r = n-1;
        int mid=0;

        while(l<=r){
            mid = (l+r)/2;

            int next = (mid+1)%n;
            int pre = (mid-1 + n)%n;

            if(nums[mid] <nums[next] && nums[mid] < nums[pre] ){
                // return nums[mid];
                break;
            }

            if(nums[mid]>nums[r])
                l = mid+1;
            else r = mid-1;

        }

        return nums[mid];
        
    }
}