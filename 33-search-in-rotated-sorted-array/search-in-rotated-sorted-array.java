class Solution {
    public int search(int[] nums, int target) {
      int start=0;
      int end=nums.length-1;
      int ans=-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            ans=mid;
            return ans;
        }
        else if(nums[start]<=nums[mid]){
            if(nums[start]<=target && nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
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