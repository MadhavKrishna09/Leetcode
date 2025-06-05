class Solution {
    public int climbStairs(int n) {
        // the higher value is depend on smaller value that is why dp.
        // int i = 0;
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n-1];
    }
}