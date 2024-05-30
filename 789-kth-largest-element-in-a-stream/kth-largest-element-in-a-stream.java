import java.util.PriorityQueue;

class KthLargest {
    final int k;
    final PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (int num : nums) {
            add(num); // Add each number using the 'add' method
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val); // Add to the heap if it's not full
        } else if (val > minHeap.peek()) {
            minHeap.poll();    // Remove the smallest if the new value is larger
            minHeap.offer(val);
        }
        return minHeap.peek(); // Return the kth largest element
    }
}
