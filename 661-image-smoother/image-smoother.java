class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] dr = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
        
        int r = img.length;
        int c = img[0].length;
        int[][] ans = new int[r][c];

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                int k = 1;
                int x = img[i][j];
                for(int[] dir : dr){
                    int nr = i+dir[0];
                    int nc = j+dir[1];
                    if(nr>=0 && nr<r && nc>=0 && nc<c){
                        x += img[nr][nc];
                        k++;
                    }
                    ans[i][j]= x/k;
                }
            }
        }
        return ans;
    }
}