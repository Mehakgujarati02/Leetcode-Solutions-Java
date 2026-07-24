class Solution {
    public void dfs(int row, int col,int[][] ans, int[][] image, int iniColor, int delRow[], 
    int delCol[], int color){
        ans[row][col] = color;
        int n= image.length;
        int m= image[0].length;

        for(int k=0; k<4; k++){
            int nrow= row+ delRow[k];
            int ncol= col+ delCol[k];
            if(nrow>= 0 && nrow<n && ncol>= 0 && ncol< m &&
            image[nrow][ncol]== iniColor && ans[nrow][ncol] != color ){
                dfs(nrow, ncol, ans, image, iniColor, delRow, 
                delCol, color);
            }
        }
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int iniColor= image[sr][sc];
        int[][] ans= image;
        int delRow[]= {-1, 1, 0, 0};
        int delCol[]= {0 ,0 ,1 ,-1};
        if(iniColor != color){ //to prevent infinite recursion
            dfs(sr, sc, ans, image, iniColor, delRow, delCol, color);
        }
        return ans;
    }
}