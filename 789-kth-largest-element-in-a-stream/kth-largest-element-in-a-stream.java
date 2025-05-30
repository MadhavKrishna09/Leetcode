class KthLargest {
    PriorityQueue<Integer> pq;
    // int min = 
    int k;


    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k = k;
        for(int i : nums ){
            if(pq.size() < k || i>pq.peek()){
                // pq.poll();
                if(pq.size() >=k) pq.poll();
                pq.offer(i);
            }
        }  
    }
    
    public int add(int val) {
        if(pq.isEmpty()) pq.offer(val);
        if(pq.size() < k || val>pq.peek()){
            if(pq.size() >=k) pq.poll();
            pq.offer(val);
            
        }
        
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */