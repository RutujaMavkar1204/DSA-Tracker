class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int i=0;
        int count=1;
        while(ans.size()<=k ){
            if(arr[i%arr.length]==count){
                i++;
                count++;
            }
            else {
               ans.add(count);
                count++;

            }
        }
        System.out.println(ans);
        System.out.println(ans.size());

        return ans.get(k-1);
    }
}