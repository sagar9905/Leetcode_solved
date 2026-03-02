class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(j)==ch && j-i<=k){
                    sb.deleteCharAt(j);
                    i=-1;
                    break;
                }
            }
        }
        return sb.toString();
    }
}