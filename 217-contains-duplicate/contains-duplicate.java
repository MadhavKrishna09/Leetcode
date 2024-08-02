class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // int[] arr = new int[n+1];
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<n;i++){
            if(hs.contains(nums[i])) return true;
            hs.add(nums[i]);
        }

        return false;
    }
}