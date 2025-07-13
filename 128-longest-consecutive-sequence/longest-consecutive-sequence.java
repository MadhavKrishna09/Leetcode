class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int res = 0;
        for(int i:set){
            int temp = 1;
            int num = i;
            if(!set.contains(num-1))
                while(set.contains(num+1) ){
                    temp++;
                    num++;

            }
            res = Math.max(res, temp);
            
        }


        return res;
    }
}