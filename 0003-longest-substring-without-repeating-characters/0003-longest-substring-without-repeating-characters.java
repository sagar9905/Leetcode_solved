class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set= new HashSet<>();
        int l=0;
        int ans=0;
        for(int r=0; r<s.length();r++){
        while(set.contains(s.charAt(r)) && l<=r){
            set.remove(s.charAt(l));
            l++;
        }
         set.add(s.charAt(r));
           ans= Math.max(ans, r-l+1);
        }
        
        return ans;
    }
}