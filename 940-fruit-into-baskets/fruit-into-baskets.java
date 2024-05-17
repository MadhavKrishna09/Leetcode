class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> mp = new HashMap<>();
        int mx = 0;
        int windowStart = 0;

        for(int windowEnd=0 ; windowEnd<fruits.length; windowEnd++){
            mp.put(fruits[windowEnd], mp.getOrDefault(fruits[windowEnd],0)+1);

            while(mp.size()>2){
                mp.put(fruits[windowStart], mp.get(fruits[windowStart]) -1);
                if(mp.get(fruits[windowStart]) == 0) {
                    mp.remove(fruits[windowStart]);}
                windowStart++;
            }

            mx = Math.max(mx, windowEnd - windowStart +1);

        }

        return mx;
        
    }
}