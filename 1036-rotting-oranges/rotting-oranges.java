// class Pair{
//     int i;
//     int j;

//     Pair(int i, int j){
//         this.i=i;
//         this.j=j;
//     }
// }

class Solution {
    public int orangesRotting(int[][] grid) {

        int n=grid.length;
        int m=grid[0].length;
        boolean visi[][]=new boolean[n][m];
        Queue<int []> q=new LinkedList<>();
        for(int i=0; i<n ;i++){
            for(int j=0; j<m ;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i , j});
                    visi[i][j]=true;
                }
            }
        }

        int dir[][]= {{1,0},{0,1},{-1,0},{0,-1}};
        int count=-1;

        while(!q.isEmpty()){
            int size=q.size();
            count++;
            for(int i=0; i<size; i++){
                int []cell=q.poll();
                int row=cell[0];
                int col=cell[1];

                for(int []d : dir){
                    int nRow=row+d[0];
                    int nCol=col+d[1];

                    if(nRow>=0 && nCol>=0 && nRow<n && nCol<m && grid[nRow][nCol]==1 && visi[nRow][nCol]==false){
                        grid[nRow][nCol]=2;
                        q.add(new int []{nRow , nCol});
                        visi[nRow][nCol]=true;
                    }
                }

           
            }
        }

        for(int i=0; i<n ;i++){
            for(int j=0; j<m ;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }


        return count==-1 ? 0 : count;

    }
}