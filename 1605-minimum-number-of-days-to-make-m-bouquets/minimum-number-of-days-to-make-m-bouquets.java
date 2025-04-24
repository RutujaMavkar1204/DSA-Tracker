class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        System.out.println(bloomDay.length);
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int start=0;
        int end=findMax(bloomDay);
        while(start<=end){
            int mid=start+(end-start)/2;
            int blooms=blooms(bloomDay, m, k, mid);
            if(blooms<m){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return start;
        
    }
    public int blooms(int[] bloomDay, int m, int k,int mid){
        int count=0;
        int originalCount=0;
        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i]<=mid ){
                count++;
                if(count==k){
                    count=0;
                    originalCount++;
                }
            }
            else{
                count=0;
            }
        }return originalCount;
        
    }
    public int findMax(int[] bloomDay){
        int max=0;
        for(int bloomDays:bloomDay){
            max=Math.max(max,bloomDays);
        }
        return max;
    }
}