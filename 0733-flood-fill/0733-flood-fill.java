class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org = image[sr][sc];
        if(org==color) return image;
        dfs(image, sr,sc, color, org);
        return image;
    }
    public void dfs(int[][]image, int i, int j, int color, int org){
        if(i<0|| i>=image.length|| j<0|| j>=image[0].length|| image[i][j]!=org){
            return;
        }
        image[i][j]=color;
        dfs(image,i+1,j,color, org);
         dfs(image,i-1,j,color, org);
          dfs(image,i,j+1,color, org);
           dfs(image,i,j-1,color, org);
    }
}