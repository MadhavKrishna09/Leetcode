class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];
        mp.put(nums[0],0);

        for(int i=1;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])) {
                return new int[]{mp.get(target-nums[i]), i};
                // ans[0] = mp.get(target-nums[i]);
                // ans[1] = i;
                // break;
            }

            mp.put(nums[i],i);
        }

        return new int[]{};

        
    }
}