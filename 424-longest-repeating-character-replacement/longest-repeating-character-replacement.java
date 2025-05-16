class Solution {
    public int characterReplacement(String s, int k) {
        // if(k==0) return 
        int max = 0;
        int[] al = new int[26];
        int i=0;
        int j=0;
        int n = s.length();
        int ans = 0;
        while(j<n){
            // char c=s.charAt(j);
            int c = s.charAt(j) - 'A';
            // i = al[c];
            al[c]++;
            max = Math.max(max, al[c]);
            // ans = Math.max(ans,j-i+1);
            if(j-i-max+1 <=k){
                ans = Math.max(ans,j-i+1);
            }
            if(j-i-max+1 >k){
                
                al[s.charAt(i) - 'A']--;
                i++;
            }
            j++;

            

        }
        return ans;

    }
}