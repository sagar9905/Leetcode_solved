class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        
        int n =nums.length;
        int cnt =0;
       long arr[]= new long[n];
       for(int i =0; i<n; i++){
        arr[i]= sum+nums[i];
        sum+= nums[i];
       }
       long r= arr[n-1];
       for(int i=0; i<n-1; i++){
        long temp =arr[i];
        if(temp>=(r-temp)) cnt++;
       }
       return cnt;
    }
}