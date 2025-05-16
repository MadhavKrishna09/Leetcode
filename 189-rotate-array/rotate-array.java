class Solution {
    public void reverse(int[] nums, int i, int j){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;j--;
        }
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        // Queue<Integer> q = new LinkedList<>();
        if(n==1) return;
        if(k==0) return;
        // for(int i:nums){
        //     q.offer(i);
        // }
        // int j = k;

        // for(int i = 0;i<j;i++){
        //     nums[i] = nums[(n-k)];
        //     k--;
        // }
        // for(int i = j;i<n;i++){
        //     nums[i] = q.poll();
        // }

        int i = 0;
        int j= n-1;
        reverse(nums, i, j);
        reverse(nums, i, k-1);
        reverse(nums, k, j);




        // if(n%2==0){
        // int j = k;
        // for(int i = 0;i<j;i++){
        //     // int temp = nums[i];
        //     nums[i] = nums[Math.abs(n-k)];
        //     // nums[Math.abs(n-k)] = temp;
        //     k--;
        // }

        // for(int i = j;i<n;i++){
        //     nums[i] = q.poll();
        // }

        // }
        // else{
        //     int j = k;
        // for(int i = 0;i<j;i++){
        //     nums[i] = nums[Math.abs(n-k)];
        //     k--;
        // }
        
        // for(int i = j;i<n;i++){
        //     nums[i] = q.poll();
        // }
        // }
    }


}