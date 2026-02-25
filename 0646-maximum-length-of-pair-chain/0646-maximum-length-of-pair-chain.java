class Solution {
    int n ;
    int dp[][]= new int[1001][1001];
    public int findLongestChain(int[][] pairs) {
     this.n = pairs.length;

      Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
     return solve(pairs,0,-1) ;
    }
    public int solve(int pairs[][], int i, int p){
    if(i>=n) return 0;
    if(p!=-1 && dp[i][p]!=0) return dp[i][p];
    int take=0;
    if(p==-1 || pairs[p][1]<pairs[i][0]){
       take = 1+solve(pairs, i+1, i);
    }
    int skip = solve(pairs, i+1,p);
    if(p!=-1) dp[i][p]= Math.max(take,skip);
    return Math.max(skip,take);
}
}