class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[2];

        // for(int i = 0;i<num.length;i++){
        //     if(num[i] <= target){
        //         if(!mp.containsKey(target-num[i])){
        //             mp.put(num[i] , i );
        //         }
        //         else {
        //             ans[1] = i + 1;
        //             ans[0]= mp.get(target-num[i]) +1; 
        //         }
        //     }
        // }

        // return ans;
        int i = 0, n = nums.length;
        while(i<n){
            if((nums[i] + nums[n-1]) == target){
                ans[0] = i +1;
                ans[1] = n-1 +1;
                break;
            }
            else if(nums[i] + nums[n-1] < target){
                if(nums[i] <= nums[n-1]) i++;
                else n--; 
            }
            else {
                if(nums[i] <= nums[n-1]) n--;
                else i++;
            }
        }

    return ans;

    }
}