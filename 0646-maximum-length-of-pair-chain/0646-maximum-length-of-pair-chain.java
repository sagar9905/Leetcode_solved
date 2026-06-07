class Solution {
    public int findLongestChain(int[][] pairs) {
      int dp[]= new int[1001];
      int n  = pairs.length;
      Arrays.fill(dp,1);
      int maxlen=0;
       Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
       for(int i=0; i<n; i++){
        for(int j=0; j<i; j++){
            if(pairs[j][1]< pairs[i][0]){
                dp[i]= Math.max(dp[i], 1+dp[j]);
            }
        }
       }
       for(int i=0; i<n; i++){
        maxlen = Math.max(maxlen, dp[i]);
       } 
       return maxlen;
    }
}
