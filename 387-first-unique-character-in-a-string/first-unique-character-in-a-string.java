class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for(char c : s.toCharArray()){
            // if(!mp.containsKey(s.charAt(i))){
            //     mp.put(s.charAt(i),0);
            // }
            // else{
            //     int v = mp.get(s.charAt(i));
            //     v++;
            //     mp.put(s.charAt(i),v);
            // }
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i)) == 1) return i;
        }

        return -1;
    }
}