class Solution {
    public int search(int[] nums, int target) {
      int pivot=findPivot(nums);
      int ans=binarySearch(nums, target, pivot, nums.length-1);
      if(ans==-1){
       ans= binarySearch(nums, target, 0, pivot);
      }
      return ans;

    }

    public int findPivot(int[] nums){
      int start=0;
      int end=nums.length-1;

    while(start<end){
        int mid=start+(end-start)/2;
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid;
            }
           
    }
    return start;  
    }
    public int binarySearch(int[] nums, int target, int start, int end){  
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return -1;
    }
}