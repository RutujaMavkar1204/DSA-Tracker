class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=findMax(nums);
        while(start<=end){
            int mid=start+(end-start)/2;
            int sum=sum(nums,mid);
            if(sum<=threshold){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int sum(int[] nums, int mid){
        int sum=0;
        for(int num:nums){
        sum+=(int)Math.ceil((double)num/mid);
    }
    return sum;
    }

   public int findMax(int[] nums){
    int ans=0;
    for(int num:nums){
        ans=Math.max(num,ans);
    }
    return ans;
   } 
}