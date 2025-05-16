class Solution {
    public int maxProfit(int[] p) {
        int n = p.length;
        if(n==1) return 0;
        int i = 0;
        int j = 1;
        int profit = 0;
        while(j<n){
            profit = Math.max(profit, p[j] -p[i]);
            if(p[j] < p[i]){
                i = j;
            }
            j++;
        }

        return profit;
    }
}