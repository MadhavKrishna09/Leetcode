import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            double distA = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
            double distB = Math.sqrt(b[0] * b[0] + b[1] * b[1]);
            return Double.compare(distB, distA); // Max-heap based on distance
        });

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > K) {
                maxHeap.poll(); // Remove the farthest point if size exceeds K
            }
        }

        int[][] result = new int[K][2];
        for (int i = K - 1; i >= 0; i--) {
            result[i] = maxHeap.poll(); // Retrieve points in reverse order for correct answer
        }
        return result;
    }
}
