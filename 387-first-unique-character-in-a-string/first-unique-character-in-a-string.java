class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),0);
            }
            else{
                int v = mp.get(s.charAt(i));
                v++;
                mp.put(s.charAt(i),v);
            }
        }

        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))<1) return i;
        }

        return -1;
    }
}