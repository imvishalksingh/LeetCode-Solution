class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int open=n;
        int close=n;
        String str="";
        solve(open, close ,str,ans );
        return ans;
        
    }

    private void solve(int open, int close,String str, List<String> ans){
    if(open==0 && close==0){
        ans.add(str);
        return;
    }
    if(open!=0){
        String newStr=str;
        newStr=newStr+"(";
        solve(open-1,close ,newStr,ans);
    }
    if(open<close){
        String secStr=str;
        secStr=secStr+")";
        solve(open,close-1,secStr,ans);
    }

    }
}