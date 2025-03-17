class Solution {
    public boolean search(int[] nums, int target) {
      int start=0;
      int end=nums.length-1;
      boolean ans=false;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            ans=true;
            return ans;
        }
        else if(nums[start]<=nums[mid]){
            if(nums[start]<=target && nums[mid]>target){
                end=mid-1;
            }
            else{
                start=start+1;
            }
        }
        else{
            if(nums[start]<=target && nums[mid]<target){
                end=mid-1;
            }
            else{
                start=start+1;
            }
        }
      }  
return ans;
    }
}