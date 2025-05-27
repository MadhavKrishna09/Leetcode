class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int h = nums.length-1;
        while(l<h){
            int mid = (l+h)/2;
            // if(target == nums[mid]) return mid;
            if(nums[mid] > nums[h]){
                l = mid+1;
            }
            else {
                h = mid;
            }


        }
        if(target>=nums[l] && target<=nums[n-1]){
            return search(nums, l, n-1, target);
        }
        else{
            return search(nums, 0, l-1, target);
        }
    }

    public int search(int[] nums, int l, int h, int target){
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid]< target){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return -1;
    }
}