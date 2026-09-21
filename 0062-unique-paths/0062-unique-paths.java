class Solution {
    Integer [][]dp = new Integer [101][101];
    public int uniquePaths(int m, int n) {
       if(m==1 && n==1) return 1;
       if(m<0 || n<0) return 0;
       
       if(dp[m][n] != null){
        return dp[m][n];
       }
       return dp[m][n]= uniquePaths(m-1, n)+uniquePaths(m,n-1);
    }
}