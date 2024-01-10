class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet(), repeated = new HashSet();


        // Map<String, Integer> mp = new HashMap<>();
        // mp.put(s.subString[0:10],0);

        for(int i =0;i<s.length()-9;i++){
            String sub = s.substring(i,i+10);
            if(!seen.add(sub))
                repeated.add(sub);
        }

        return new ArrayList(repeated);
    }
}