class Solution {
    public int maxProfit(int[] prices) {
        int i =0, ans = 0;
        int n = prices.length;
        int j = 1;

        while(j<n){
            int t = prices[j] - prices[i];
            if(t>0){
                j++;
                ans = Math.max(t, ans);
                // i++;
            }
            else {
                i = j;
                j++;
            }
            // ans = Math.max(prices[i] - prices[i], ans);


        }
        return ans;




















        // int pre = 0;
        // int n = prices.length;
        // if(n==1) return 0;
        // int succ = 1;

        // int max= 0;

        // while(succ<n){
        //     if(prices[succ]<prices[pre]){
        //         pre = succ;
        //         succ++;
        //     }
        //     else{
        //         // int buy = prices[pre];
        //         max = Math.max(max, prices[succ] - prices[pre]);
        //         succ++;
                
        //         // pre++;

        //     }
        // }

        // return max;

        
    }
}