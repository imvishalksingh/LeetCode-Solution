class Solution {
    public int findCircleNum(int[][] isConnected) {

        Map<Integer, List<Integer>> graph=new HashMap<>();  
    
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                graph.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                }
            }   
        }
        
        boolean visited[]=new boolean[isConnected.length];
        int count=0;
        for(int i=0 ; i<visited.length ; i++){
            if(visited[i]==false){
            dfs(i, graph , visited);
            count++;
            }
        }
        return count;
    }

    private void dfs(int src ,  Map<Integer, List<Integer>> graph , boolean visited[] ){
        
        visited[src]=true;
        for(int adj : graph.getOrDefault(src,  new ArrayList<>())){
            if(visited[adj]==false){
                dfs(adj , graph , visited);
            }
        }

    }

}