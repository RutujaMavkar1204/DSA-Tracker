class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character, Character> map=new HashMap<>();
       StringBuilder ans=new StringBuilder(s);
        if(s.length()!=t.length()){
            return false;
        }
        int i=0;
        while(i<s.length()){
            if(map.containsValue(t.charAt(i))){
               
            }
            else{
                map.put(s.charAt(i),t.charAt(i));
            }
            i++;
        }
        int j=0;
        while(j<s.length()){
            if(map.get(s.charAt(j))==null){
                return false;
            }
            else{
            ans.setCharAt(j,map.get(s.charAt(j)));
            j++;}
        }
        if(ans.toString().equals(t)){
            return true;
        }
  return false;
    }
}