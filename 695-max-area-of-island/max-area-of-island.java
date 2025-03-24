// class Solution {
//     public int dfs(int[][] grid, int i, int j, int r, int c, int[][] visited ){
//         if(i<0 || j<0 || i>=r || j>=c || visited[i][j] == 1 || grid[i][j] == 0) return 0 ;
//         visited[i][j] = 1;
//         int area = 1;
//         area += dfs(grid, i + 1, j, r, c, visited);
//         area += dfs(grid, i - 1, j, r, c, visited);
//         area += dfs(grid, i, j + 1, r, c, visited);
//         area += dfs(grid, i, j - 1, r, c, visited);
//         // visited[i]
//         return area;
//     }



//     public int maxAreaOfIsland(int[][] grid) {
//         int r = grid.length;
//         int c = grid[0].length;
//         int[][] visited = new int[r][c];
//         int ans = 0;

//         for(int i =0;i<r;i++){
//             for(int j =0;j<c;j++){
//                 if(grid[i][j] == 1 && visited[i][j] == 0){
//                     int t = dfs(grid, i, j, r, c, visited);
//                     ans = Math.max(t, ans);

//                 }
//             }
//         }

//         return ans;
//     }
// }

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, getArea(grid, i, j));
                }
            }
        }
        return max;
    }
    private int getArea(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        return 1 + getArea(grid, i - 1, j) + getArea(grid, i + 1, j) + getArea(grid, i, j - 1) + getArea(grid, i, j + 1);
    }
}