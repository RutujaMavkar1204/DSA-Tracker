class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans=new StringBuilder();
        int count=0;
         int min=1000;
        for(int i=0; i<strs.length; i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }
        for(int i=0; i<min; i++){
            for(int j=0; j<strs.length; j++){
               char d=strs[0].charAt(count);
            if(strs[j].charAt(i)==d){
            }
            else{
                return ans.toString();
            }
        }
        ans=ans.append(strs[0].charAt(count));
        count++;
        }
                return ans.toString();
    }
}