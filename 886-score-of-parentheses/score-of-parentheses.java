class Solution {
    public int scoreOfParentheses(String s) {
        int score=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(score);
                score=0;
            }else{
                score=st.peek()+Math.max(2*score,1);
                st.pop();
            }
        }
        return score;
    }
}