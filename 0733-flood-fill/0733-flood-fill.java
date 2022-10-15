class Solution {
    
    int dirs[][]=new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
    int[][] image;
    int startingColor;
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        this.image=image;
        startingColor=image[sr][sc];
        dfs(sr,sc);
        
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==-1){
                    image[i][j]=color;
                    
                }
            }
        }
        
        return image;
    }
    
    void dfs(int row, int col){
        
        image[row][col]=-1;
        
        for(int[] dir: dirs){
            int r=row+dir[0];
            int c=col+dir[1];
            
            if(r<0 || c<0 || r>image.length-1 || c>image[0].length-1 || image[r][c]!=startingColor) continue;
            dfs(r,c);
                
        }
        
        
    }
}