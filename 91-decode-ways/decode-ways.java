class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        
        for (int i = 2; i <= n; i++) {
            if (s.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }
            char first = s.charAt(i - 2);
            char second = s.charAt(i - 1);
            if (first == '1' || (first == '2' && second <= '6')) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}