import java.util.*;

class Solution {
 int n ;
long dp[][];
    public long maxAlternatingSum(int[] nums) {
     this.n= nums.length;
     dp= new long[n][2];
   for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
     return solve(nums,dp,0, 1);
    }
    public long solve(int nums[],long dp[][],int i, int flag){
        if(i>=n) return 0;
        if(dp[i][flag]!=-1) return dp[i][flag];
        long skip = solve(nums,dp, i+1,flag);
        long val =nums[i];
        if(flag==0){
            val= -val;
        }
        long take= solve(nums,dp, i+1, 1-flag)+val;
        return dp[i][flag]=Math.max(skip,take);
    }
}
