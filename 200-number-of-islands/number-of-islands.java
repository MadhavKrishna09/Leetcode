public class pair {
    int first;
    int second;
    pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public void bfs(int i, int j,int[][] visited, char[][] grid){
        Queue<pair> q = new LinkedList<>();
        visited[i][j] = 1;
        q.add(new pair(i,j));
        int n = grid.length;
        int m = grid[0].length;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            

            for (int[] dir : directions) {
                int nrow = row + dir[0];
                int ncol = col + dir[1];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
                grid[nrow][ncol] == '1' && visited[nrow][ncol]==0){
                    q.add(new pair(nrow, ncol));
                    visited[nrow][ncol] = 1;
                    }
            }

            // for(int delrow =-1; delrow<2;delrow++){
            // for(int delcol =-1;delcol<2;delcol++){
            //     int nrow = row+delrow;
            //     int ncol = col + delcol;
            //     if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&
            //     grid[nrow][ncol] == '1' && visited[nrow][ncol]==0){
            //         q.add(new pair(nrow, ncol));
            //         visited[nrow][ncol] = 1;
            //     }
            // }

        }

        }

    public int numIslands(char[][] grid) {
        
        int count =0;
        int r = grid.length;
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        int ans = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    ans++;
                    bfs(i,j,visited,grid);

                }
            }
        }

        return ans;
        
    }
}