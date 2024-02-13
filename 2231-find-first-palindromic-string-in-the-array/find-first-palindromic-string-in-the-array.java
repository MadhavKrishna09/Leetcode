class Solution {
    public boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }
            else return false;
        }

        return true;
    }

    public String firstPalindrome(String[] words) {
        String ans = "";
        for(String s : words){
            if(isPalindrome(s)){
                return s;
            }
        }
        return ans;
    }

    
}