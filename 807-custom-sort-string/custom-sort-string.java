class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> mp = new LinkedHashMap<>();
        char[] ch = s.toCharArray();
        //to store the frequency of each element in s
        for(int i=0;i<s.length();i++){
            mp.put(ch[i],mp.getOrDefault(ch[i],0) + 1 );
        }
        // int n=s.length();
        // char[] ans = new char[n];

        for(char c:order.toCharArray()){
            if(mp.containsKey(c)){
                // int count = mp.get(c);
                sb.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
                mp.remove(c);
                    
            }
        }
        for (char c : mp.keySet()) {
            sb.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
        }


        return sb.toString();

        
        
    }
}