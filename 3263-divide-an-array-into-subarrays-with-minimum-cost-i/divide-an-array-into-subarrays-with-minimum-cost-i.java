class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        int m1 = Integer.MAX_VALUE,m2 = Integer.MAX_VALUE;

        for(int i =1;i<nums.length;i++){
            if(nums[i]<m1){
                m2 = m1;
                m1 = nums[i];
                
            }
            else if(nums[i]<m2)
                {m2 = nums[i];}
        }

        return sum + m1+m2;
        
    }
}