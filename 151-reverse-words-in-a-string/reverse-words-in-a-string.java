class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String ans="";
        
        for(int i=0; i<arr.length/2; i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==""){
            }
            else{
                 ans=ans+arr[i]+" ";
            }
            
            
        }
        return ans.trim();
    }


}