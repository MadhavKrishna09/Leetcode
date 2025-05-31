class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //how the priority is decided when numbers are same
        for(int i: nums){
            if(pq.size() < k){
                pq.offer(i);

            }else if(i>=pq.peek()){
                pq.poll();
                pq.offer(i);
            }
        }

        return pq.peek();
    }
}