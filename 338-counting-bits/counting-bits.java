class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        int offset = 1;

        for(int i = 1 ;i<=n;i++){
            // if(i==1) ans[i] = 1;
            if(offset * 2 == i)
                offset = i;
            ans[i] = 1 + ans[i-offset];
        }

        return ans;
        
    }
}