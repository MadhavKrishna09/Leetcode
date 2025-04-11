class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0) break; // Early termination
            if (k > 0 && nums[k] == nums[k-1]) continue; // Skip duplicates for k
            
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) {
                    i++;
                } else if (sum > 0) {
                    j--;
                } else {
                    ans.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[i+1]) i++; // Skip duplicates for i
                    while (i < j && nums[j] == nums[j-1]) j--; // Skip duplicates for j
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}