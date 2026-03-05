class Solution {
    public int vowelConsonantScore(String s) {
        int n = s.length();
        int cv= 0; 
        int cc =0;
        for(int i= 0; i<n; i++){
          if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u')   cv++;
          else if(Character.isLetter(s.charAt(i))){
                cc++;
        }
        }
       if( cc == 0) return 0;
       return cv/cc;
    }
}