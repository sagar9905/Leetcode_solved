
class Solution {
    public long maxAlternatingSum(int[] nums) {
     Long dp[][] = new Long[nums.length][2];
     return solve(nums,nums.length, 0, 1, dp);
    }
    public long solve( int[] nums, int n, int i, int c, Long dp[][] ){
     if(i>= nums.length) return 0;
     if(dp[i][c] !=null) return  dp[i][c];
     int val = nums[i];
     if(c==0){
        val = -val;
     }
     long take = solve(nums,n, i+1, 1-c, dp)+val;
      long skip = solve(nums,n, i+1,c, dp );
      return dp[i][c]= Math.max(take,skip);
    }
}
