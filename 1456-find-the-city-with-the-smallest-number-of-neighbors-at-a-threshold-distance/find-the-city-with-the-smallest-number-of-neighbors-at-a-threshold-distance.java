class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] adj = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                adj[i][j] = Integer.MAX_VALUE;

            }
        }

        for(int[] row : edges){
            adj[row[0]][row[1]] = row[2];
            adj[row[1]][row[0]] = row[2];
        }
        for(int i =0;i<n;i++) adj[i][i] = 0;

        for(int k =0;k<n;k++){
            for(int i =0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(adj[i][k] == Integer.MAX_VALUE || adj[k][j] == Integer.MAX_VALUE) continue;
                    adj[i][j] = Math.min(adj[i][j], adj[i][k]+adj[k][j]);
                }
            }
        }
        int cntCity = n;
        int city = -1;
        for(int i =0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(adj[i][j] <= distanceThreshold ) count++;
            }
            if(count<=cntCity){
                cntCity = count;
                city = i;
            }

        } 

        return city;       
    }
}