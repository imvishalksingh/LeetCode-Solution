class Solution {
    public int minSwaps(String s) {
        int open=0;
        int close=0;
        int left=0;
        int right=s.length()-1;
        int swap=0;
        StringBuilder string = new StringBuilder(s);
        for(int i=0;i<string.length()-1;i++){
            char c=string.charAt(i);
            if(c=='['){
                open++;
            }else{
                close++;
            }
            if(close>open){
                
                while(string.charAt(right)!='['){
                    right--;
                }
                if(string.charAt(right)=='['){
                    string.setCharAt(left,string.charAt(right));
                    string.setCharAt(right,']');
                    close--;
                    open++;
                    swap++;
                }
            }
        }
        return swap;
    }
}