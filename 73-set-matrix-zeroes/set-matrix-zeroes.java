class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
             for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
         for(int k=0; k<matrix.length; k++){
                         for(int z=0; z<matrix[0].length; z++){
                            if(row.contains(k)||col.contains(z)){
                                matrix[k][z]=0;
                               
                            }
                        
                    } 
                    }
    }
}