class Solution {
    
    public int rob(int[] nums) {
    if(nums.length==1)return nums[0];
    int a=0;
    int b=nums[0];
    int c=0;
    for(int i=2; i<=nums.length; i++){
        c=Math.max(nums[i-1]+a,b);
        a=b;
        b=c;
    }
    return c;
    }
   
}