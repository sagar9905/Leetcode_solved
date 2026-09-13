class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cur=1;
        int len=1;
        if(nums.length==0) return 0;
        for(int i=1;i<nums.length;i++){
           if(nums[i-1]+1==nums[i]){
            cur++;
           }
           else if(nums[i-1]==nums[i]){

           }
           else{
            cur=1;
           }
           len = Math.max(len,cur);
        }
        return len;
    }
}