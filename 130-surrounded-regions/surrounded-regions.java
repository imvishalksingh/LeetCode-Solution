class Solution {
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean [][]visited=new boolean[n][m];

        // for(int i=0 ;i <n ;i++){
        //     if(board[0][i]=='O'){
        //         if(visited[0][i]==false)
        //         dfs(0, i, n, m, board, visited);
        //     }
        //     if(board[n-1][i]=='O'){
        //         if(visited[m-1][i]==false)
        //         dfs(m-1, i, n, m, board, visited);
        //     }
        //     if(board[i][0]=='O'){
        //         if(visited[i][0]==false)
        //         dfs(i, 0, n, m, board, visited);
        //     }
        //     if(board[i][m-1]=='O'){
        //         if(visited[i][n-1]==false)
        //         dfs(i, n-1, n, m, board, visited);
        //     }
        // }

         for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && !visited[i][0])
                dfs(i, 0, n, m, board, visited);
            if (board[i][m - 1] == 'O' && !visited[i][m - 1])
                dfs(i, m - 1, n, m, board, visited);
        }

        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O' && !visited[0][j])
                dfs(0, j, n, m, board, visited);
            if (board[n - 1][j] == 'O' && !visited[n - 1][j])
                dfs(n - 1, j, n, m, board, visited);
        }

        for(int i = 0;i<n;i++) {
            for(int j= 0 ;j<m;j++) {
                if(visited[i][j] == false && board[i][j] == 'O') 
                    board[i][j] = 'X'; 
            }
        }
    }

    private void dfs(int i, int j, int n ,int m , char[][] board , boolean[][] visited){

       if (i < 0 || j < 0 || i >= n || j >= m || visited[i][j] || board[i][j] != 'O')
            return;

        visited[i][j] = true;

        dfs(i - 1, j, n, m, board, visited);
        dfs(i + 1, j, n, m, board, visited);
        dfs(i, j - 1, n, m, board, visited);
        dfs(i, j + 1, n, m, board, visited);
    }
}