// class Solution {
//     // int max = 0;
//     public String longestPalindrome(String s) {
//     //     // StringBuilder sb  = new StringBuilder();
//     //     String ans = "";
//     //     int n = s.length();
//     //     // int max 
//     //     if(n== 1) return s;
//     //     for(int i = 0;i<n;i++){
//     //         // StringBuilder sb = new StringBuilder();

//     //         String a = checkPalindrome(s, i, i);
//     //         String b = checkPalindrome(s, i, i+1);
//     //         if(a.length()>ans.length()) {
//     //             ans = a;
//     //         }
//     //         if(b.length() > ans.length()){
//     //             ans = b;
//     //         }
//     //     }

//     //     return ans;

//     // }

//     // private String checkPalindrome(String s, int i, int j){
//     //     int n = s.length();
//     //     while(i>=0 && j<n){
//     //         if(s.charAt(i) == s.charAt(j)){
//     //             // sb.add(s.charAt(i));
//     //             i--;
//     //             j++;
//     //         }
//     //         else{ break; }
//     //     }

//     //     return  s.substring(i + 1, j);


//     }
// }
class Solution {
    public String longestPalindrome(String s) {
       int n = s.length();
       String res = "";
       boolean[][] dp = new boolean[n][n];
       for(int i=0;i<n;i++){
            dp[i][i] = true;
            res = s.substring(i,i+1);
       }

       for(int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                // if(res.length() < 2)
                    res  = s.substring(i,i+2);
            }
       }

       for(int len = 3;len<=n;len++){
            for(int i=0;i<=n-len;i++){
                int j = i+len-1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] ){
                    dp[i][j] = true;
                    if(len > res.length()){
                        res = s.substring(i,j+1);
                    }
                }
            }
       }

       return res;

    }
} 
