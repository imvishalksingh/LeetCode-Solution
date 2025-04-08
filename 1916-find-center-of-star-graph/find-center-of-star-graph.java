class Solution {
    public int findCenter(int[][] e) {
        
        if(e[0][0] == e[1][0] || e[0][0]== e[1][1]) return e[0][0];
        else return e[0][1];
        
    }
}