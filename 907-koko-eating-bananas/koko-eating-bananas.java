class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int start=1;
       int end=findMax(piles);

       while(start<=end){
        int mid=start+(end-start)/2;
        long speed=findSpeed(piles, mid);
        if(speed>h){
             start=mid+1;
        }
        else{
            end=mid-1;
           
        }

       }return start;

    }
    public int findMax(int[] piles){
        int ans=0;
        for(int pile:piles){
            ans=Math.max(pile,ans);
        }
        return ans;
    }

     public long findSpeed(int[] piles,int mid){
        long speed=0;
        for(int pile:piles){
            speed+=(long)Math.ceil((double)pile/mid);
        }
        
        return speed;
     }
}