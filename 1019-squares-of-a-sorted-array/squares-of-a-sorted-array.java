class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start =0;
        int end = nums.length-1;
        int n = nums.length;

        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[start]) >= Math.abs(nums[end])){
                ans[i] = nums[start]*nums[start];
                start++;
            }
            else{
                ans[i] = nums[end]*nums[end];
                end--;
            }
        }
        
        // while(l<i && i<h){
        //     if(Math.abs(nums[l])<Math.abs(nums[i])){
        //         nums[h] = nums[h]*nums[h];
        //         h--;
        //     }

        // }
        // for(int p=i;p<h;p++){
        //     nums[p] = nums[p]*nums[p];

        // }
        // if(nums[i] == 0){ 
        //     int temp = nums[l];
        //     nums[l] = nums[i];
        //     nums[i-1] = temp*temp;
        //     l++;
        // }

        // while(l<i){
        //     int temp = nums[i-1];
        //     nums[i-1] = nums[l]*nums[l];
        //     nums[l] = temp*temp;
        //     l++;
        //     i--;
        // }
        // for(int )
        // while(l<h){
        //     if(Math.abs(nums[l])<Math.abs(nums[h])){
        //         nums[h] = nums[h]*nums[h];
        //         h--;
        //     }
        //     else{
        //         int temp = nums[l];
        //         nums[l] = nums[h];
        //         nums[h] = temp*temp;
        //         h--;
        //     }
        // }
        // nums[l] = nums[l]*nums[l];
        return ans;
    }
}