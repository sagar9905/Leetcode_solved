class Solution {
    public int maxFrequency(int[] nums, int k) {
       int l=0;
       int r =0;
       int n = nums.length;
        Arrays.sort(nums);
       long pre[]= new long[n];
       pre[0]=nums[0];
       for(int i=1; i<n; i++){
        pre[i]=pre[i-1]+nums[i];
        
       } 
      
       int max =0;
       while(l<=r && r<n){
        long wsum=0;
        long cursum=0;
        int len= r-l+1;
         wsum = (long)len*nums[r];
         if(l==0){
            cursum =(long)pre[r];
         }
         else{
         cursum= (long)(pre[r]-pre[l-1]);
         }
         if(wsum-cursum>k){
            l++;
         }
         else{
            max =Math.max(max, (len));
            r++;    
         
       }
       }
       return max;
    }
}