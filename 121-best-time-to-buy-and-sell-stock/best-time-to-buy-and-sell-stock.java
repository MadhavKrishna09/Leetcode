class Solution {
    public int maxProfit(int[] prices) {
        int pre = 0;
        int n = prices.length;
        if(n==1) return 0;
        int succ = 1;

        int max= 0;

        while(succ<n){
            if(prices[succ]<prices[pre]){
                pre = succ;
                succ++;
            }
            else{
                // int buy = prices[pre];
                max = Math.max(max, prices[succ] - prices[pre]);
                succ++;
                
                // pre++;

            }
        }

        return max;

        
    }
}