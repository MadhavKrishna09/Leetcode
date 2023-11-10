class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int count = 0;
        int j =0;

        for(int i =0;i<s.length();i++){
             maxCost -= Math.abs((int) s.charAt(i) - (int)t.charAt(i));
            if(maxCost<0){ 
                maxCost += Math.abs((int) s.charAt(j) - (int)t.charAt(j++));
            }
        }

        return s.length() - j;

    }
}

