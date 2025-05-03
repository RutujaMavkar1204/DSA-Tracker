class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int start=0;
        int end=mat[0].length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int max= findmax(mat,mid);
            

            boolean isBiggerThanLeft=isBiggerL(mat,mid,max);
            boolean isBiggerThanRight=isBiggerR(mat,mid,max);

            if(isBiggerThanLeft && isBiggerThanRight){
                 System.out.println("ans:"+new int[] {max+1, mid+1});
                return new int[] {max, mid};
            }
            else if(isBiggerThanLeft){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
                
        }return new int[] {-1, -1};
    }
    public boolean isBiggerL(int[][] mat, int mid, int max){
        if(mid-1>=0){
            if(mat[max][mid]<mat[max][mid-1]){
                 System.out.println("isBiggerL"+mat[max][mid-1]);
                return false;
            }
        }return true;
        
    }
    public boolean isBiggerR(int[][] mat, int mid, int max){
        if(mid+1<mat[0].length){
            if(mat[max][mid]<mat[max][mid+1]){
                System.out.println("isBiggerR"+mat[max][mid+1]);
                return false;
            }
        }return true;
        
    }
    public int findmax(int[][] mat, int mid){
        int max=-1;
        int count=0;
        for(int i=0; i<mat.length; i++){
            if(mat[i][mid]>max){
                max=mat[i][mid];
                count=i;
            }
        }
        System.out.println("count"+count);
        return count;
    }
}