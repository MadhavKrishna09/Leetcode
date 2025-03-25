class Solution {
    private final int[][] directions = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Initialize queue with all rotten oranges and count fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0; // No fresh oranges to rot

        int minutes = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int x = cell[0];
                int y = cell[1];

                for (int[] dir : directions) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2; // Rot the orange
                        queue.offer(new int[]{nx, ny});
                        fresh--;
                        rotted = true;
                    }
                }
            }

            if (rotted) minutes++; // Only increment if oranges rotted this minute
        }

        return fresh == 0 ? minutes : -1;
    }
}