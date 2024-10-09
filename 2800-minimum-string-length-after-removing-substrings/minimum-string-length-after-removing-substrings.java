class Solution {
    public int minLength(String s) {
      
        Stack<Character> st=new Stack<>();
        st.add(' ');
        for(char c : s.toCharArray()){
            if((c=='B' && st.peek()=='A') || (c=='D' && st.peek()=='C')){
                st.pop();
            }else{
                st.push(c);
            }
        }

        return st.size()-1;

    }
}