class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> st = new HashSet<>();
        Map<Character, Integer> mp = new HashMap<>();
        int windowStart = 0;
        int ans = 0;
        if(s.isEmpty()) return 0;
        // if(s == null || s.trim().isEmpty()) return 1;

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(mp.containsKey(c) && mp.get(c) >= windowStart){
                // ans = Math.max(ans, i-windowStart);
                windowStart = mp.get(c)+1;

                // windowStart++;
            }
            mp.put(c, i); 
            ans = Math.max(ans, i - windowStart + 1);
        }

        return ans;


        
    }
}