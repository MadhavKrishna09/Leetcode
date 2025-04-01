class Solution {
    // public static String longestPalindrome(String a){
    //     int n = a.length();
    //     String ans = "";
    //     for(int i = 0;i<n;i++){
    //         // StringBuilder sb = new StringBuilder();
    //         String temp = expand(a, i, n);
    //         if(temp.length() > ans.length()){
    //             ans = temp;
    //         }
    //     }

    //     return ans;
    // }

    // public static String expand(String a, int i, int n){
    //     StringBuilder sb = new StringBuilder();
    //     if(i==0) return a.subString()
    //     while(i>=0 && i<n){
    //         int j = 1;
    //         sb.append(a.charAt(i));
    //         if(a.charAt(i-j) == a.charAt(i+j)){
    //             sb.append(a.charAt(i-1));
    //             j++;
    //         }
    //         else break;
    //     }

    //     return sb.toString();
    // }

    // public static String longestPalindrome(String a){
    //     int n = a.length();
    //     int[][] dp = new int[n+1][n+1];
    //     for(int i = 1;i<=n;i++){
    //         for(int j = 1;j<=n;j++){
    //             dp[i][j] = -1;
    //             // dp[0][i] = -1;
    //         }
    //     }
    //     StringBuilder sb = new StringBuilder(a);
    //     int m = sb.length();
    //     String b = sb.reverse().toString();
    //     for(int i = 1;i<=n;i++){
    //         for(int j= 1;j<=m;j++){
    //             if(a.charAt(i-1) == b.charAt(j-1)){
    //                 dp[i][j] = 1+dp[i-1][j-1];
    //             }
    //             else {
    //                 dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
    //             }
    //         }
    //     }

        

    //     // int ans = LCS(a, b, n, m, dp);
    //     StringBuilder str = new StringBuilder();
    //     while(n>0 && m>0){
    //         if(a.charAt(n-1) == b.charAt(m-1)){
    //             str.append(a.charAt(n-1));
    //             n--;
    //             m--;
    //         }
    //         else{
    //             if(dp[n-1][m] >= dp[n][m-1]){
    //                 n--;
    //             }
    //             else if(dp[n][m-1] > dp[n-1][m]){
    //                 m--;
    //             }
    //         }
    //     }

    //     return str.toString();
    // }
// }


    // public static int LCS(String a, String b,int n,int m, int[][] dp){
    //     if(n==0 || m==0) return 0;
    //     if(dp[n][m] != -1) return dp[n][m];

    //     if(a.charAt(n-1) == b.charAt(m-1)){
    //         return dp[n][m] = 1 + LCS(a, b, n-1, m-1, dp);
    //     }
    //     else{
    //         return dp[n][m] = Math.max(LCS(a, b, n-1, m, dp), LCS(a, b, n, m-1, dp));
    //     }
    // }
// }
    



    // public String longestPalindrome(String s) {
    //     String ans = "";
    //     int len = 0;

    //     for(int i = 0;i<s.length();i++){
    //         int l = i;
    //         int r = i;
           
    //         while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
    //             if(r-l+1 > len){
    //                 ans = s.substring(l,r+1);
    //                 len = r-1+1;
    //             }
    //             l--;r++;
    //         }
            
            
    //         l = i;
    //         r = i+1;
    //         while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
    //             if(r-l+1 > len){
    //                 ans = s.substring(l,r+1);
    //                 len = r-1+1;
    //             }
    //             l--;r++;
    //         }
            

    //     }

    //     return ans;
    // }

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }

        return maxStr;
    }

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
