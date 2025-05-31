class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>((double[] a,double[] b) -> Double.compare(b[2] , a[2]));
        int n = points.length;
        for(int[] i : points){
            int x = i[0];
            int y = i[1];
            double d = Math.sqrt(x*x + y*y);
            if(pq.size() < k){
                pq.offer(new double[]{x,y,d});
                
            }
            else if(d < (pq.peek()[2])){
                pq.poll();
                pq.offer(new double[]{x,y,d});
            }
        }
        int[][] ans = new int[k][2];
        int i = 0;
        while(pq.size()>0 && i<k){
            ans[i][0] = (int)pq.peek()[0];
            ans[i][1] = (int)pq.peek()[1];
            i++;
            pq.poll();
        }
        return ans;
    }
}