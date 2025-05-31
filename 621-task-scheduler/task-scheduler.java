class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c: tasks){
            freq[c-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i : freq){
            if(i!=0) pq.offer(i);
        }
        // int count = 0;
        Queue<int[]> q = new LinkedList<>();
        int time = 0;
        while(!pq.isEmpty() || !q.isEmpty() ){
            time++;
             while (!q.isEmpty() && q.peek()[1] <= time) {
                pq.offer(q.poll()[0]);
            }
            if (!pq.isEmpty()) {
                int remaining = pq.poll() - 1;
                if (remaining > 0) {
                    q.offer(new int[]{remaining, time + n + 1});
                }
        }

        }

        return time;
    }
}