// class Solution {
//     public void bfs(int[][] visited, int[][] water, int rl, int cl, int[][] ans, Queue<int[]> q) {
//         int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
//         while (!q.isEmpty()) {
//             int[] cell = q.poll();
//             int row = cell[0];
//             int col = cell[1];
//             int steps = cell[2];

//             for (int[] dir : directions) {
//                 int nr = row + dir[0];
//                 int nc = col + dir[1];

//                 if (nr >= 0 && nr < rl && nc >= 0 && nc < cl && visited[nr][nc] != 1) {
//                     ans[nr][nc] = steps + 1;
//                     q.offer(new int[]{nr, nc, steps + 1});
//                     visited[nr][nc] = 1;
//                 }
//             }
//         }
//     }

//     public int[][] highestPeak(int[][] water) {
//         int n = water.length;
//         int m = water[0].length;
//         Queue<int[]> q = new LinkedList<>();
//         int[][] visited = new int[n][m];
//         int[][] ans = new int[n][m];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (water[i][j] == 1) {
//                     q.offer(new int[]{i, j, 0});
//                     visited[i][j] = 1;
//                 }
//             }
//         }
//         bfs(visited, water, n, m, ans, q);
//         return ans;
//     }
// }
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length;
        int m = isWater[0].length;

        int[][] matrix = new int[n][m];
        for(int[] row: matrix){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Queue<Pair> qu = new LinkedList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(isWater[i][j] == 1){
                    matrix[i][j] = 0;
                    qu.add(new Pair(i, j));
                }
            }
        }
        
        while(!qu.isEmpty()){
            Pair curr = qu.poll();
            int r = curr.first;
            int c = curr.second;

            int[] dr = {1, 0, -1, 0};
            int[] dc = {0, 1 ,0, -1};

            for(int i=0; i<4; i++){
                int nr = r + dr[i];
                int nc = c + dc[i];

                if(nr>=0 && nc>=0 && nr<n && nc<m && matrix[nr][nc] > 1+matrix[r][c]){
                    matrix[nr][nc] = 1 + matrix[r][c];
                    qu.add(new Pair(nr, nc));
                }
            }
        }
        return matrix;
    }
}
class Pair{
    int first;
    int second;

    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
