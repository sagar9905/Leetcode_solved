class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String , List<String>>map = new HashMap<>();
     for(String s:strs){
        String t = s;
        char arr[]= s.toCharArray();
        Arrays.sort(arr);
        s= new String(arr);
        if(!map.containsKey(s)){
            List<String>li = new ArrayList<>();
            li.add(t);
            map.put(s,li);
        }
        else{
            map.get(s).add(t);
        }
     } 
     return new ArrayList<>(map.values());  
    }
}