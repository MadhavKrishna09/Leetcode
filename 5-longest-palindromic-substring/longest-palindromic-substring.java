class Solution {
    int max = 0;
    public String longestPalindrome(String s) {
        // StringBuilder sb  = new StringBuilder();
        String ans = "";
        int n = s.length();
        // int max 
        if(n== 1) return s;
        for(int i = 0;i<n;i++){
            // StringBuilder sb = new StringBuilder();

            String a = checkPalindrome(s, i, i);
            String b = checkPalindrome(s, i, i+1);
            if(a.length()>ans.length()) {
                ans = a;
            }
            if(b.length() > ans.length()){
                ans = b;
            }
        }

        return ans;

    }

    private String checkPalindrome(String s, int i, int j){
        int n = s.length();
        while(i>=0 && j<n){
            if(s.charAt(i) == s.charAt(j)){
                // sb.add(s.charAt(i));
                i--;
                j++;
            }
            else{ break; }
        }

        return  s.substring(i + 1, j);
    }
}