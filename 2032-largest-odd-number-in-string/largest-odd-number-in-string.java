class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length(); i>0; i--){
            String part=num.substring(0,i);
            char last=part.charAt(part.length()-1);
            int num1=Integer.parseInt(String.valueOf(last));
            if(num1%2!=0){
                return part;
            }  
        }
    return "";        
    }
}