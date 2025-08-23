class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int start=1;
        int end=findMax(bloomDay);
        if(m>bloomDay.length/k){
            return -1;
        }
       int days= bs(m,bloomDay,start,end, k);
       return days;
    }  
    public int bs(int m, int[] bloomDay, int start, int end, int k){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            int getDays=getDays(mid, bloomDay, k);
            if(getDays>=m){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }return start;
    }
    public int getDays(int mid, int[] bloomDay, int k){
        int count=0;
        int ans=0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=mid){
                count++;
                if(count==k){
                    ans++;
                    count=0;
                }
            }
            else{
                count=0;
            }

        }return ans;
    }

    public int findMax(int[] bloomDay){
        int max=0;
        for(int bloomDays:bloomDay){
            max=Math.max(max,bloomDays);
        }
        return max;
    }
}