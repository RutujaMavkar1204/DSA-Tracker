class Solution {
    public int maxDepth(String s) {
        int i=0;
        int count=0;
        int ans=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                count++;
                ans = Math.max(ans, count);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            else{

            }
            i++;
        }return ans;
    }
}