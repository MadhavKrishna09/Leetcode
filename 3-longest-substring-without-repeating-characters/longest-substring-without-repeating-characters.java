class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();
        if(n<=1) return n;
        int i = 0;
        int j=0;
        int ans =0;
        while(j<n){
            if(mp.containsKey(s.charAt(j))){
                i = Math.max(i, mp.get(s.charAt(j)) + 1);
                // j++;
            }
            
            mp.put(s.charAt(j), j);
            j++;
            ans=Math.max(ans, j-i);

            
            
            // j++;
        }

        return ans;


    }
}