class Solution {
    public int largestAltitude(int[] gain) {
     int n  = gain.length;
     int pre[]= new int[n+1];
     pre[0]=0;
    int max= 0; 
     for(int i=1; i<n+1;i++){
        pre[i]= pre[i-1]+gain[i-1];
        max = Math.max(max, pre[i]);
     }   
     return max;
    }
}