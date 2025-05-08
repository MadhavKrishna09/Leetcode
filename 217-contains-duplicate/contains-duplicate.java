class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int n = nums.length;
        Set<Integer> hs = new HashSet<>();
        for(int n:nums){
            if(hs.contains(n)) return true;
            else hs.add(n);
        }

        return false;

    }
}