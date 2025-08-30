class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        StringBuilder ans=new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                System.out.println(map);
            }
            else{
                map.put(s.charAt(i),1);
                System.out.println(map);
            }i++;
        }
        while(map.size()>0){
           char max=calcChar(s,map) ;
            int total= map.get(max);
            for(int j=0;j<total; j++){
                ans.append(max);
            }
            map.remove(max);

        }
        return ans.toString();

    }
    public char calcChar(String s,HashMap<Character, Integer> map){
        int max=0;
        int i=0;
        char ans=' ';
        while(i<s.length()){
            char c = s.charAt(i);
             if(map.get(c) != null && map.get(c) > max){
                max=map.get(s.charAt(i));
                ans=s.charAt(i);
             }
             i++;
        }return ans; 
        
    }
}