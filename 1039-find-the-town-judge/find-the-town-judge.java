class Solution {
    public int findJudge(int n, int[][] trust) {

        int []check=new int[n+1];

        for(int i =0 ;i <trust.length ;i++){
            int p1=trust[i][0];
            int p2=trust[i][1];
            check[p1]-=1;
            check[p2]+=1;

        }

        for(int i=1; i<check.length ;i++){
            if(check[i]==n-1){
                return i;
            }
        }
        
        return -1;
    }
}