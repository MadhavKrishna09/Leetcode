class Solution {
    Queue<int[]> q = new LinkedList<>();
    int ans = 0;
    int[][] dr= {{-1, 0}, {1,0}, {0,-1}, {0,1}};
    int fresh = 0;
    public int orangesRotting(int[][] grid) {
        
        int r = grid.length;
        int c = grid[0].length;
        
        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        if(fresh == 0) return 0;
        while(!q.isEmpty()){
            int s = q.size();
            boolean rotten = false;
            for(int i = 0;i<s;i++){
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];

                for(int[] d : dr){
                    int nr = x+d[0];
                    int nc = y+d[1];
                    if(nr<r && nr >=0 && nc<c && nc>=0 && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        q.offer(new int[]{nr, nc});
                        rotten = true;
                        fresh--;
                    }
                }

            }
            if(rotten) ans++;
        }

        return fresh==0 ? ans:-1;
    }
}