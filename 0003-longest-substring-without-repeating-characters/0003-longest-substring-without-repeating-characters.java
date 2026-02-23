class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length(); 
       int l=0;
       int r =0;
       int maxlen =0;
       Set<Character> set = new HashSet<>();
       while(r<n){
       if(!set.contains(s.charAt(r))){
       set.add(s.charAt(r));
       maxlen= Math.max(maxlen, r-l+1);
       r++;
       }
       else{
        set.remove(s.charAt(l));
                l++;
       }
       }
       return maxlen;
    }
}