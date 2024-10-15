class Solution {
    public long minimumSteps(String s) {
    long ans=0;
    int oneCount=0;
    for(char c: s.toCharArray()){
        if(c=='1'){
            oneCount++;
        }else{
            ans+=oneCount;
        }
    }    
    return ans;
    }
}