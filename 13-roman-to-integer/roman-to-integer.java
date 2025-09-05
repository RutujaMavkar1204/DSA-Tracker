class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> map=Map.of('I',1,'V',5, 'X',10, 'L', 50, 'C', 100,'D', 500, 'M',1000);
        int i=0;
        int count=0;
        int ans=0;
        while(i<s.length()-1){
            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
               int temp=map.get(s.charAt(i+1))-map.get(s.charAt(i));
                System.out.println("temp"+temp);
               ans=ans+temp;
               if(i<s.length()-2){
                count=0;
               }
               else{
                count=1;
               }
               i+=2;
               
            }
            else{
                System.out.println(ans);
                ans=ans+map.get(s.charAt(i));
                i++;
                count=0;
            }
            
        }
        if(count==0){
            System.out.println(ans);
            return ans+map.get(s.charAt(s.length()-1));
            
        }
        return ans;
    }
}