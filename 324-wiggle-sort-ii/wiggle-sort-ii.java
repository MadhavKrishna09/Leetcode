class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] temp = new int[n];
        int low = (n+1) /2;
        int high = n;
        for(int i=0;i<n;i++) {
            temp[i] = i%2 == 0 ? nums[--low] : nums[--high];
        }

        for(int j=0; j<n;j++ ){
            nums[j] = temp[j];
        }
        
    }
}