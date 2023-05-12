class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jls = new HashSet<>();
        int count = 0;
        
        for (int s= 0;s<jewels.length();s++){
            jls.add(jewels.charAt(s));
        }
        
        for(char s : stones.toCharArray()){
            if(jls.contains(s))
            {count++;}
        }
        return count;
    }
}