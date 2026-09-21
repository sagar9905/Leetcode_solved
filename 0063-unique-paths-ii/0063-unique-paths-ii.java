class Solution {
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      Integer dp[][]= new Integer[101][101];
      return solve(obstacleGrid,dp,obstacleGrid.length-1,obstacleGrid[0].length-1);
    }
    public int solve(int[][]obstacleGrid,Integer dp[][],int n,int m){
        if(n<0 ||m<0|| obstacleGrid[n][m]==1) return 0;
        if(n==0 && m==0) return 1;
        if(dp[n][m]!=null) return dp[n][m];
        return dp[n][m]=solve(obstacleGrid,dp,n-1,m)+solve(obstacleGrid,dp,n,m-1);
    }
}