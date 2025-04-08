class Solution {
    public int findCenter(int[][] edges) {
        
        int elength=edges.length+1;
        int arr[]=new int[elength+1];

        for(int []a:edges){
            arr[a[0]]++;
            arr[a[1]]++;
        }

        for( int i=1 ;i <=elength ;i++){
            if(arr[i]==edges.length) return i;
        }

        return -1;
    }
}