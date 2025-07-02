class Solution {

    public int countTexts(String pressedKeys) {

        int MOD = 1_000_000_007;
        int n = pressedKeys.length();

        long[] dp = new long[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            char currentChar = pressedKeys.charAt(i - 1);

            dp[i] = dp[i - 1];

            if (i >= 2 && pressedKeys.charAt(i - 2) == currentChar) {
                dp[i] = (dp[i] + dp[i - 2]) % MOD;
            } else {

                continue;
            }

            if (i >= 3 && pressedKeys.charAt(i - 3) == currentChar) {
                dp[i] = (dp[i] + dp[i - 3]) % MOD;
            } else {
                continue;
            }
            

            if ((currentChar == '7' || currentChar == '9') && i >= 4 && pressedKeys.charAt(i - 4) == currentChar) {
                dp[i] = (dp[i] + dp[i - 4]) % MOD;
            }
        }
        return (int) dp[n];
    }
}