class Solution {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public List<List<Integer>> pacificAtlantic(int[][] h) {
        int r = h.length;
        int c = h[0].length;
        List<List<Integer>> ans = new ArrayList<>();
        boolean[][] p = new boolean[r][c];
        boolean[][] a = new boolean[r][c];
        // if(r<=1 && c<=1) return ans.add(new ArrayList());
        for(int i = 0;i<r;i++){
            dfs(h, p, r, c , i, 0);
            dfs(h, a, r, c, i, c-1);
        }

        for(int j =0;j<c;j++){
            dfs(h, p, r, c, 0, j);
            dfs(h, a, r, c, r-1, j);
        }


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(p[i][j] && a[i][j]){
                    List<Integer> ar = new ArrayList<>();
                    ar.add(i);
                    ar.add(j);
                    ans.add(ar);
                }
            }
        }

        return ans;
    }

    private void dfs(int[][] h,boolean[][] v,  int r, int c, int i, int j ){
        v[i][j] = true;

        for(int[] d : directions){
            int ni = i+d[0];
            int nj = j+d[1];
            if(ni>=0 && ni<r && nj>=0 && nj<c && !v[ni][nj] && h[ni][nj] >= h[i][j]){
                dfs(h,v,r,c,ni,nj);
            }
        }
    }
}