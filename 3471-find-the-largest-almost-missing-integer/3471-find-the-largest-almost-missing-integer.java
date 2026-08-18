class Solution {
    public int largestInteger(int[] nums, int k) {
        int n  = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
 int ans = Integer.MIN_VALUE;

       if(k==1){
   
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

    if (entry.getValue() == 1) {
        ans = Math.max(ans, entry.getKey());
    }
}
       }
      else if(k==n){
        

        for(int i=0; i<n; i++){
            ans = Math.max(ans, nums[i]);
        }
       }
       else{
        int first = nums[0];
int last = nums[nums.length - 1];



if (map.get(first) == 1) {
    ans = first;
}

if (map.get(last) == 1) {
    ans = Math.max(ans, last);
}


       }
       if(ans==Integer.MIN_VALUE)  return -1;
       else return ans;
    }
}