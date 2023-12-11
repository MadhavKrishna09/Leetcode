class Solution {
    
    public void dfs(int r, int c , int color, int[][] image,int target){
        
        image[r][c] = color;
        int n = image.length;
        int m = image[0].length;
        int[][] directions = {{-1,0},{1,0},{0,1},{0,-1}};
       

        for(int[] dir:directions){
            int nrow = r+dir[0];
            int ncol = c+dir[1];

            if(nrow>=0&&ncol>=0 && nrow<n && ncol<m&& image[nrow][ncol] == target ){
                dfs(nrow,ncol,color,image,target);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r = image[sr][sc];
        if(r!= color)
        dfs(sr,sc,color,image,r);
        
        
        return image;

        
    }
}