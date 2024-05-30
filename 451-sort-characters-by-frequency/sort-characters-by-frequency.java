class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mp = new HashMap<>();

        for(char c:s.toCharArray()){
            // if(mp.containsKey(c)){
            //     mp.put(c,mp.get(c)+1);
            // }
            // else{
            //     mp.put(c,1);
            // }
            mp.put(c, mp.getOrDefault(c,0) +1);
        }

        List<Map.Entry<Character,Integer>> ls = new ArrayList<>(mp.entrySet());
        ls.sort(Map.Entry.comparingByValue());
        String ans = "";
        for(Map.Entry<Character, Integer> m:ls){
            int n = m.getValue();
            String s1 = String.valueOf(m.getKey());
            ans = ans + s1.repeat(n);
        }

        return new StringBuilder(ans).reverse().toString();
    }
}