class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int j =0;
        for(int i =1;i<prices.length;i++){
            if(prices[j]<prices[i]){
                profit = profit+prices[i]-prices[j];
                j=i;
            }
            else{
                j++;
            }
        }

        return profit;
        
    }
}