class Solution {
    public String longestDiverseString(int a, int b, int c) {
    
        StringBuilder str=new StringBuilder("");
        int total=a+b+c;
        int curA=0;
        int curB=0;
        int curC=0;
        while(total>0){
            if((a>=b && a>=c && curA!=2) || (curB==2 || curC==2) && a>0 ){
                str.append("a");
                a--;
                curA++;
                curB=0;
                curC=0;
            }else if((b>=a && b>=c && curB!=2) || (curC==2 || curA==2) && b>0){
                str.append("b");
                b--;
                curB++;
                curA=0;
                curC=0;
            }else if((c>=a && c>=b && curC!=2) || (curA==2 || curB==2) && c>0 ){
                str.append("c");
                c--;
                curC++;
                curB=0;
                 curA=0;
            }
            total--;
        }
        return str.toString();
    }
}