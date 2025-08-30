class Solution {
    public boolean rotateString(String s, String goal) {
        int count= 0;
        int start=getStart(s, goal, count);
        count=start;
        System.out.println(start);
        int i=0;
         if(s.length()!=goal.length()){
            return false;
        }
        while(i<s.length()){
             if(start==-1){
            return false;
        }
            if(s.charAt(i)==goal.charAt(start%goal.length())){
                i++;
                start++;
            }
            else{
               start= getStart(s, goal, count+1); 
               count=start;  
                 System.out.println(start);   
                i=0;
            }
        }
       
        return true;




        
    }
    public int getStart(String s, String goal, int count){
         System.out.println(count);
        while(count<s.length()){
            if(s.charAt(0)==goal.charAt(count)){
                System.out.println("crrr");
                System.out.println(count);
                return count;
            }
            else{
                count++;
            }
        }
        return -1;
    }
}