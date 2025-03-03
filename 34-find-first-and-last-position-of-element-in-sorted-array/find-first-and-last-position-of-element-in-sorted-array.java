class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[] ans={-1,-1};
      bs(nums,ans, target,true);
      bs(nums,ans, target,false) ;
      
      return ans;
    }
    void bs(int[] nums,int[] ans, int target, boolean value){
         int start=0; 
       int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                if(value){
                    start=mid+1;
                    ans[1]=mid;
                }
                else{
                    end=mid-1;
                    ans[0]=mid;
                }
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
}