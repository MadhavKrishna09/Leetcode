class Solution {
    public String maximumOddBinaryNumber(String s) {
        int length = s.length();
        int count_0 = 0;
        int count_1 = 0;

        for(char c: s.toCharArray()){
            if(c == '0') count_0++;
            else count_1++;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count_1 - 1; i++) {
            result.append('1');
        }
        for (int i = 0; i < count_0; i++) {
            result.append('0');
        }
        result.append('1');
        
        return result.toString();
        // return ans;
        
    }
}