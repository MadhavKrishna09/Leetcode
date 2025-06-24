class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans  = new ArrayList<Integer>();
        int n = nums.length;
        int i = 0, j=0;
        while(j<n && i<n){
            if(nums[j] == key){
                if(Math.abs(i-j)>k){
                    if(i>j) j++;
                    else i++;
                    // i++;
                    // continue;
                }
                else{
                    ans.add(i);
                    i++;
                }

            }
            else{
                j++;
            }
            
        }

        return ans;
    }
}