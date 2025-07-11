class Solution {
    int[][] dir = {{0,1}, {0,-1}, {1, 0}, {-1,0}};
    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[][] visited = new int[r][c];
        int answer = 0;

        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == '1' && visited[i][j] ==0){
                    answer++;
                    dfs(grid, i, j, r, c, visited);
                }
            }
        }
        return answer;


    }

    private void dfs(char[][] grid, int i, int j, int r, int c, int[][] visited){
        visited[i][j] = 1;
        Stack<int[]> st = new Stack<>();
        st.push(new int[]{i, j});
        while(!st.isEmpty()){
         int[] x = st.pop();

        for(int[] d : dir){
            int nr = x[0]+d[0];
            int nc = x[1]+d[1];

            if(nr >=0 && nr < r && nc>=0 && nc<c && visited[nr][nc] ==0 && grid[nr][nc] == '1'){
                visited[nr][nc] = 1;
                st.push(new int[]{nr, nc});

            }
        }
        }
    }
}