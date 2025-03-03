class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        Map<Character, Integer> mp = new HashMap<>();
        // We need frequency not just char.
        for(char c : s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }

        for(char c : t.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) - 1);
        }

        for(int val : mp.values()){
            if(val !=0) return false;
        }
    return true;
    }
}
