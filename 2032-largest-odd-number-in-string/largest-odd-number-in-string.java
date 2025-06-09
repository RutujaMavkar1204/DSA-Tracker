class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--){
            String part=num.substring(0,i+1);
            int last=(int)part.charAt(part.length()-1);
            if(last%2!=0){
                return part;
            }  
        }
    return "";        
    }
}