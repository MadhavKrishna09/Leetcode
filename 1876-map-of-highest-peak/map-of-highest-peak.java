class Solution {
    public void bfs(int[][] visited, int[][] water, int rl, int cl, int[][] ans, Queue<int[]> q) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0];
            int col = cell[1];
            int steps = cell[2];

            for (int[] dir : directions) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                if (nr >= 0 && nr < rl && nc >= 0 && nc < cl && visited[nr][nc] != 1) {
                    ans[nr][nc] = steps + 1;
                    q.offer(new int[]{nr, nc, steps + 1});
                    visited[nr][nc] = 1;
                }
            }
        }
    }

    public int[][] highestPeak(int[][] water) {
        int n = water.length;
        int m = water[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] visited = new int[n][m];
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (water[i][j] == 1) {
                    q.offer(new int[]{i, j, 0});
                    visited[i][j] = 1;
                }
            }
        }
        bfs(visited, water, n, m, ans, q);
        return ans;
    }
}
