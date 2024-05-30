class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        // PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i =0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0) +1);
        }

        // for(int i =0;i<nums.length;i++){
        //     minHeap.offer(nums[i]);
        //     int freq = mp.get(nums[i]);
        //     if( minHeap.size()<=k || freq > mp.get(minHeap.peek()))
        //         minHeap.offer(nums[i]);

            

        // }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> mp.get(n1) - mp.get(n2));

        for(Integer key : mp.keySet()){
            minHeap.offer(key);
            // int freq = mp.get(key);
            // if(mp.size()<= key)
            //     minHeap.offer(key);
            // else if(freq > mp.get(minHeap.peek()))
            //     minHeap.offer(key);

            if(minHeap.size() > k) minHeap.poll();
        }

        int[] ans = new int[k];
        k--;

        while(k>=0){
            ans[k--] = minHeap.poll();
        }

        return ans;

        
    }
}