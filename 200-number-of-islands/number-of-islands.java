class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        for(int i=0; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                if(grid[i][j]=='1'){
                    dfs(i, j, grid, n ,m);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(int i, int j , char [][]grid , int n , int m){
        if(i<0 || j <0 || i>=n || j>=m) return;
        if(grid[i][j]=='1'){
            grid[i][j]='H';

            dfs(i , j-1 , grid , n, m);
            dfs(i-1 , j , grid , n, m);
            dfs(i , j+1 , grid , n, m);
            dfs(i+1 , j , grid , n, m);
        }else{
            return;
        }
    }
}