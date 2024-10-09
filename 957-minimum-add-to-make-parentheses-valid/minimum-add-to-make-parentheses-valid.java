class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        st.add(' ');
        for(char c:s.toCharArray()){
            if(c=='('){
                st.add('(');
            }else if(c==')' && st.peek()=='('){
                st.pop();
            }else{
                st.add(')');
            }
        }
        return st.size()-1;
    }
}