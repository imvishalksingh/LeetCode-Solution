class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        if(grid[0].length==1){
            for(int i=0;i<grid.length;i++){
                if(grid[0][i]<0){
                   count++; 
                }
            }
        }else{
        for(int i=0;i<grid.length;i++){
            for(int j=grid[0].length-1;j>=0;j--){
                if(grid[i][j]<0){
                    count++;
                }else{
                    j=0;
                }
            }
        }
        }
        return count;
    }
}