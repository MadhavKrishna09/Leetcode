class Solution {
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
