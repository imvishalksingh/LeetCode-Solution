class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean visi[]=new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<visi.length;i++){
            if(visi[i]==false){
                dfs(i, visi , isConnected);
                count++;
            }
        }
        return count;
    }

    public static void dfs(int start , boolean[] visi , int [][] adj){

        visi[start] = true;
      
        for (int i = 0; i < adj[start].length; i++) {
 
            // If some node is adjacent to the current node
            // and it has not already been visited
            if (adj[start][i] == 1 && (!visi[i])) {
                dfs(i, visi , adj);
            }
        }
        
    }
}