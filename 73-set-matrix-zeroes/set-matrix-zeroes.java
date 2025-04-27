import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        int[][] visited = new int[n][m];
        
        // Copy original matrix into visited
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = matrix[i][j];
            }
        }
        
        // First pass: mark rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        visited[i][k] = 0;
                    }
                }
            }
        }
        
        // Second pass: mark columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        visited[k][j] = 0;
                    }
                }
            }
        }
        
        // Copy visited matrix back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = visited[i][j];
            }
        }
    }
}
