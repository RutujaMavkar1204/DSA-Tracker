class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        int i=0;
        while(i<s.length()){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
            i++;
        }
        int j=0;
        while(j<t.length()){
           if(map.containsKey(t.charAt(j))){
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            }
            else{
                return false;
            }j++;
        }
        
        int k=0;
        while(k<s.length()){
            if(map.get(s.charAt(k))!=0){
                return false;
            }
            k++;
        }
        
        return true;
    }
}