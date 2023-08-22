class Solution {
    public int subarraySum(int[] nums, int k) {
        int currentSum = 0;
        int count = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        
        for (int  i=0;i<nums.length;i++){
            currentSum = currentSum+nums[i];
            if(mp.containsKey(currentSum-k)){
                count += mp.get(currentSum-k);
            }
            mp.put(currentSum, mp.getOrDefault(currentSum,0)+1);
            

        }
        return count;
        
    }
}