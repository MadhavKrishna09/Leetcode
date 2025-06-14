class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i] = true;
            count++;

        }

        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
                dp[i][i+1] = true;
            }
        }

        for(int len=3;len<=n;len++){
            for(int i = 0;i<=n-len;i++){
                int j = i+len-1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    count++;
                    dp[i][j] = true;
                }
            }
        }

        return count;
    }
}