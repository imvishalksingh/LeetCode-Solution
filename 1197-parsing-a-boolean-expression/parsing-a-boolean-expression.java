public class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();

        for (char currChar : expression.toCharArray()) {
            if (currChar == ',') continue;
            if (currChar == 't' || currChar == 'f' || currChar == '!' || currChar == '&' || currChar == '|') {
                st.push(currChar);
            } else if (currChar == ')') {
                boolean hasTrue = false, hasFalse = false;
                while (st.peek() == 't' || st.peek() == 'f') {
                    if (st.pop() == 't') hasTrue = true;
                    else hasFalse = true;
                }
                
                char op = st.pop();
                st.push(op == '!' ? (hasTrue ? 'f' : 't') : (op == '&' ? (hasFalse ? 'f' : 't') : (hasTrue ? 't' : 'f')));
            }
        }

        return st.peek() == 't';
    }
}
