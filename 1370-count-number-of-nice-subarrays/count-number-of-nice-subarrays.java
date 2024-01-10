class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd_count = 0;
        int left =0, right =0;
        int n = nums.length;
        int ans =0;

        while(right<n){
            while(right<n && odd_count<k){

                odd_count = nums[right] %2 ==1 ? odd_count+1:odd_count;
                right++;
            }
            if(odd_count == k){
                int a = 1;
                while(right<n && nums[right]%2 == 0){
                    a++;
                    right++;
                }
                int b =1;
                while( left<n &&nums[left] %2 == 0 ){
                    b++;
                    left++;
                }
                ans += a*b;
                left++;
                odd_count--;
            }
        
        }

        return ans;

    }
}