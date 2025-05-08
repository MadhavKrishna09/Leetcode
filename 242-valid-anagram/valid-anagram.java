class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> mp = new HashMap<>();
        for(char c: s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) +1);

        }
        for(char c: t.toCharArray()){
            if(!mp.containsKey(c)) return false;
            int n = mp.get(c);
            n--;
            mp.put(c,n);
        }
        for(char c: s.toCharArray()){
            if(mp.get(c) !=  0) return false;
        }

        return true;

    }
}