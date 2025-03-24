class Solution {
    public void dfs(char[][] grid, int i, int j, int[][] visited, int r, int c){
        if(grid[i][j] == '0' ) return;
        // visited[i][j] = 1;
        if(grid[i][j] == '1' && visited[i][j] == 0) {
            visited[i][j] =1;
            // ans++;
            if(i-1>=0) dfs(grid, i-1, j, visited, r, c);
            if(i+1<r)  dfs(grid, i+1, j, visited, r, c);
            if(j+1<c)  dfs(grid, i, j+1, visited, r, c);
            if(j-1>=0) dfs(grid, i, j-1, visited, r, c);
         }
        else return;
        
    }

    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        int ans = 0;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] != '0'  && visited[i][j] == 0) {
                    ans++;
                    dfs(grid, i, j, visited, r, c);
                }
            }
        }

        return ans;
    }
}