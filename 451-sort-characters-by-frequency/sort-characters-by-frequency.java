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

        PriorityQueue<Character> minHeap = new PriorityQueue<>((a,b) -> mp.get(b) - mp.get(a));

        // List<Map.Entry<Character,Integer>> ls = new ArrayList<>(mp.entrySet());
        // ls.sort(Map.Entry.comparingByValue());
        String ans = "";
        // for(Map.Entry<Character, Integer> m:ls){
        //     int n = m.getValue();
        //     String s1 = String.valueOf(m.getKey());
        //     ans = ans + s1.repeat(n);
        // }

        for(char c : mp.keySet()){
            minHeap.offer(c);
            
        }

        while(minHeap.size()>0){
            int freq = mp.get(minHeap.peek());
            char ch = (char) minHeap.poll();
            ans += String.valueOf(ch).repeat(freq);
        }

        return ans;
    }
}