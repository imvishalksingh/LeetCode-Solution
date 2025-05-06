class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int originalColor=image[sr][sc];

        if(image[sr][sc]!=color){
            image[sr][sc]=color;
            dfs( sr, sc , n , m , image , color , originalColor );
        }

        return image;
    }

    private void dfs(int i, int j , int n ,  int m , int [][]image , int color ,int oC){
        int [][]dir={{1,0},{0,1},{-1,0},{0,-1}};

        for(int []d : dir){
            int nr= i + d[0];
            int nc= j + d[1];

            if(nr>=0 && nc>= 0 && nr<n && nc <m && image[nr][nc]==oC){
                image[nr][nc]=color;
                dfs(nr , nc , n , m , image , color , oC);
            }
        }

    }
}