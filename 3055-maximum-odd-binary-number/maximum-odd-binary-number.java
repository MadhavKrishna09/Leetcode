class Solution {
    public String maximumOddBinaryNumber(String s) {
        int length = s.length();
        int count_0 = 0;
        int count_1 = 0;

        for(char c: s.toCharArray()){
            if(c == '0') count_0++;
            else count_1++;
        }

        String ans = "1".repeat(count_1 -1) + "0".repeat(count_0)+"1";

        return ans;
        
    }
}