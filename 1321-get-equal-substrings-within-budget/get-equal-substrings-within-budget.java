class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int windowStart = 0;
        int count=0;
        int cost = 0;

        for(int windowEnd = 0;windowEnd<s.length();windowEnd++){
            cost  +=  Math.abs((int)s.charAt(windowEnd) - (int)t.charAt(windowEnd));

            while(cost>maxCost){
               cost -= Math.abs((int)s.charAt(windowStart) - (int)t.charAt(windowStart));
               windowStart++;

            }

            count = Math.max(count, windowEnd - windowStart +1);
        }

        return count;
    }
}