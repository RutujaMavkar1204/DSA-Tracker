class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        int ans=0;
      if(nums.length==1){
        return nums[0];
      }
        for(int i=0; i<nums.length; i++){
            count=0;
             for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                 count++;
                   
               }
            }
             if(count<2){
             ans=nums[i];
        }
           
           
        }
        return ans;
    }
}