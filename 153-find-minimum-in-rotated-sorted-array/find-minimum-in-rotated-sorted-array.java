class Solution {
    public int findMin(int[] nums) {
       int start=0;
       int end=nums.length-1;
       int ans=nums[0];
       if(nums.length==1){
        return nums[0];
       }
       while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]>nums[(mid+1)%(nums.length)]){
            ans=nums[(mid+1)%(nums.length)];
            return ans;
        }
        else if(nums[start]<nums[mid]){
            start=mid+1;
        }
        else{
           end=end-1;
        }
       } return ans;
    }
}