class Solution {
    public int myAtoi(String s) {
        int ans=0;
        int i=0;
        s=s.trim();
        if(s.length()<1){
            return ans;
        }
        if(s.charAt(i)=='-' ){
            ans=getNumber(i+1,s,'-');
            return ans*-1;
            
            }
            else if(Character.isDigit(s.charAt(i)) || s.charAt(i)=='+'){
                if( s.charAt(i)=='+'){
                    ans=getNumber(i+1,s,'+');
                return ans;
                }
                ans=getNumber(i,s,'+');
                return ans;
            }
            else{
                return ans;
            }
        
    }
    public int getNumber(int i, String s,char sign){
        int ans=0;
        int num=0;
        while(i<s.length()){
            if(!Character.isDigit(s.charAt(i))){
                return ans;
            }
            if(sign=='-' && (ans>(Integer.MAX_VALUE/10) ||(ans==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>=8 ) )){
                System.out.println(ans);
                return Integer.MIN_VALUE;
            }
            if(sign=='+'&& (ans>(Integer.MAX_VALUE/10) ||(ans==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>=7 ) ) ){
                System.out.println("'cat'");
                System.out.println(s.charAt(i)-'0');
                return Integer.MAX_VALUE;
            }
            else{
                 num=s.charAt(i)-'0';
                 ans=ans*10+num;
            }i++;
        }return ans;
    }
}