class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] fre = new int[26];
        int[] win = new int[26];

        for(char c: s1.toCharArray()){
            fre[c-'a'] ++;
        }   

        for(int i = 0;i<s2.length();i++){
            win[s2.charAt(i)-'a'] ++;
            if(i>=s1.length()){
                win[s2.charAt(i-s1.length()) - 'a'] --;
            }
            if(Arrays.equals(fre, win)) return true;
        }     

        return false;
   }
}