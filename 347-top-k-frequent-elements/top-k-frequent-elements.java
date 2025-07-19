class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[1] - b[1]);

        for(int i =0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0) +1);
        }
        // ArrayList<Integer> arr = new ArrayList<>();
        

        for(int i : mp.keySet()){
            int t = mp.get(i);
            minHeap.offer(new int[]{i,t});
            if(minHeap.size() > k) {
                minHeap.poll();
            }
            
        }

        int[] ans = new int[k];
        int i= 0;
        while(!minHeap.isEmpty()){
            ans[i++] = minHeap.poll()[0];
        }

        return ans;

        

        
    }
}